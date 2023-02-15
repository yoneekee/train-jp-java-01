package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice06 extends JFrame {

  public Practice06() {
    setTitle("NULL LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

    Container contentPane = getContentPane();

    contentPane.setLayout(null);

    JLabel label = new JLabel("");
    // label.setLocation(100, 100);
    // label.setSize(200, 20);
    label.setBounds(100, 100, 200, 30);
    contentPane.add(label);

    for (int i = 0; i < 20; i++) {
      JButton button = new JButton(Integer.toString(i));
      int x = (int) (Math.random() * 200) + 50;
      int y = (int) (Math.random() * 200) + 50;
      button.setLocation(x, y);
      button.setSize(10, 10);
      button.setBackground(Color.blue);
      contentPane.add(button);
    }
  }

  public static void main(String[] args) {
    new Practice06();
  }
}
