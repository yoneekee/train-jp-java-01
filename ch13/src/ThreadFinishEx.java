import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {

  private Container contentPane;
  private int size = 500;
  private boolean flag = false;

  public void finish() {
    this.flag = true;
  }

  RandomThread(Container contentPane) {
    this.contentPane = contentPane;
  }

  public void run() {
    while (true) {
      JLabel label = new JLabel("Java");
      int x = (int) (Math.random() * (size - 50));
      int y = (int) (Math.random() * (size - 50));
      label.setSize(80, 20);
      label.setLocation(x, y);
      contentPane.add(label);
      contentPane.repaint();
      try {
        Thread.sleep(200);
        if (flag) {
          return; // 종료시켜버린다 (빠져나가게)
        }
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class ThreadFinishEx extends JFrame {

  ThreadFinishEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(null);
    RandomThread rt = new RandomThread(contentPane);
    rt.start();
    contentPane.addMouseListener(
      new MouseAdapter() {
        public void mouseReleased(MouseEvent e) {
          int x = (int) (Math.random() * (450));
          int y = (int) (Math.random() * (450));
          JLabel finish = new JLabel("finish");
          finish.setSize(80, 20);
          finish.setForeground(Color.RED);
          finish.setLocation(x, y);
          contentPane.add(finish);
          rt.finish();
        }
      }
    );

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new ThreadFinishEx();
  }
}
