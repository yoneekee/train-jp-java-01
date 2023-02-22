import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuActionEventEx extends JFrame {

  private JLabel imgLabel = new JLabel();

  MenuActionEventEx() {
    this.setTitle("menu");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(imgLabel, BorderLayout.CENTER);
    JMenuBar menuBar = new JMenuBar();
    JMenu screenMenu = new JMenu("Screen");
    JMenuItem menuItems[] = new JMenuItem[4];
    String itemTitle[] = { "Load", "Hide", "Reshow", "Exit" };
    MenuActionListener menuActionListener = new MenuActionListener();

    for (int i = 0; i < 4; i++) {
      menuItems[i] = new JMenuItem(itemTitle[i]);
      menuItems[i].addActionListener(menuActionListener);
      screenMenu.add(menuItems[i]);
    }

    menuBar.add(screenMenu);
    this.setJMenuBar(menuBar);
    this.setSize(300, 500);
    this.setVisible(true);
  }

  class MenuActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      //System.out.println(command);
      switch (command) {
        case "Load":
          imgLabel.setIcon(new ImageIcon("ch14/images/jun.jpg"));
          break;
        case "Hide":
          imgLabel.setVisible(false);
          break;
        case "Reshow":
          imgLabel.setVisible(true);
          break;
        case "Exit":
          System.exit(0); // 시스템 닫는 명령어
          break;
        default:
          break;
      }
    }
  }

  public static void main(String[] args) {
    new MenuActionEventEx();
  }
}
