package ETC;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SwingDownloadBar extends JFrame {

  private JTextField txtURL;
  private JProgressBar progressBar;
  private JButton btnDownload;

  public static void main(String[] args) {
    EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          SwingDownloadBar form = new SwingDownloadBar();
          form.setVisible(true);
        }
      }
    );
  }

  public SwingDownloadBar() {
    // Create Form Frame
    super("스윙을 이용한 파일 다운로드 화면");
    setSize(525, 270);
    setLocation(500, 280);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);

    // Label Title
    final JLabel lblTitle = new JLabel("Download File", JLabel.CENTER);
    lblTitle.setBounds(73, 24, 370, 14);
    getContentPane().add(lblTitle);

    // TextField URL
    String fileURL =
      "https://github.com/JetBrains/kotlin/releases/download/v1.6.10/kotlin-native-windows-x86_64-1.6.10.zip";
    fileURL =
      "https://download.springsource.com/release/STS4/4.13.0.RELEASE/dist/e4.22/spring-tool-suite-4-4.13.0.RELEASE-e4.22.0-win32.win32.x86_64.self-extracting.jar";
    txtURL = new JTextField(fileURL);
    txtURL.setHorizontalAlignment(SwingConstants.CENTER);
    txtURL.setBounds(73, 66, 370, 20);
    getContentPane().add(txtURL);

    // ProgressBar
    progressBar = new JProgressBar();
    progressBar.setStringPainted(true);
    progressBar.setMinimum(0);
    progressBar.setMaximum(100);
    progressBar.setBounds(166, 99, 190, 20);
    getContentPane().add(progressBar);

    // Button Download
    btnDownload = new JButton("Download");
    btnDownload.setBounds(217, 118, 100, 23);

    ThreadDownloadActionListener downloadActionListener = new ThreadDownloadActionListener(
      progressBar,
      txtURL,
      btnDownload
    );

    btnDownload.addActionListener(downloadActionListener);
    getContentPane().add(btnDownload);
  }
}

class ThreadDownloadActionListener implements ActionListener {

  private JTextField txtURL;
  private JProgressBar progressBar;
  private JButton btnDownload;

  public ThreadDownloadActionListener(
    JProgressBar progressBar,
    JTextField txtURL,
    JButton btnDownload
  ) {
    this.txtURL = txtURL;
    this.btnDownload = btnDownload;
    this.progressBar = progressBar;
  }

  public void actionPerformed(ActionEvent e) {
    btnDownload.setEnabled(false);
    EventQueue.invokeLater(
      new Runnable() {
        @Override
        public void run() {
          DownloadWorkerThread downloadWorkerThread = new DownloadWorkerThread(
            progressBar,
            txtURL,
            btnDownload
          );
          downloadWorkerThread.start();
        }
      }
    );
  }
}

class DownloadWorkerThread extends Thread {

  JTextField txtURL;
  JProgressBar progressBar;
  JButton btnDownload;

  public DownloadWorkerThread(
    JProgressBar progressBar,
    JTextField txtURL,
    JButton btnDownload
  ) {
    this.txtURL = txtURL;
    this.progressBar = progressBar;
    this.btnDownload = btnDownload;
  }

  @Override
  public void run() {
    try {
      URL url = new URL(txtURL.getText());

      URLConnection conexion = url.openConnection();
      conexion.connect();
      int lengthOfFile = conexion.getContentLength();
      InputStream input = new BufferedInputStream(url.openStream());

      // File Name
      String source = txtURL.getText();
      String fileName = source.substring(
        source.lastIndexOf('/') + 1,
        source.length()
      );

      // Copy file
      String saveFile = null;
      try {
        saveFile = new File(".").getCanonicalPath() + "\\files\\" + fileName;
      } catch (IOException e1) {
        e1.printStackTrace();
      }
      OutputStream output = new FileOutputStream(saveFile);

      byte data[] = new byte[1024 * 10];
      int count = 0;
      long total = 0;

      while ((count = input.read(data)) != -1) {
        total += count;
        output.write(data, 0, count);

        progressBar.setValue((int) ((total * 100) / lengthOfFile));
        sleep(5);
      }

      output.flush();
      output.close();
      input.close();
    } catch (Exception ex) {
      System.err.println(ex);
    }
    //
    //
    return;
  }

  //
  protected void done() {
    JOptionPane.showMessageDialog(
      null,
      "데이터 가져오기 잘수행했습니다.༼ つ ◕_◕ ༽つ"
    );
    btnDownload.setEnabled(true);
  }

  public static void main(String[] args) {}
}
