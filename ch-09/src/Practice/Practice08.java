package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice08 extends JFrame {

  public Practice08() {
    setTitle("Calc");

    Container contentPane = getContentPane();
    JPanel northJ = new JPanel();
    northJ.setBackground(Color.gray);
    northJ.setSize(500, 50);
    northJ.setLayout(new FlowLayout());
    northJ.add(new JButton("열기"));
    northJ.add(new JButton("닫기"));
    northJ.add(new JButton("나가기"));

    JLabel centerJ = new JLabel("");
    centerJ.setBounds(100, 100, 200, 30);

    for (int i = 0; i < 10; i++) {
      JLabel button = new JLabel("*");
      int x = (int) (Math.random() * 400) + 50;
      int y = (int) (Math.random() * 100) + 50;
      button.setLocation(x, y);
      button.setSize(30, 30);
      button.setForeground(Color.red);
      centerJ.add(button);
    }

    JPanel southJ = new JPanel();

    southJ.setBackground(Color.yellow);
    southJ.setSize(500, 50);
    southJ.setLayout(new FlowLayout());
    southJ.add(new JLabel("Word Input"));
    southJ.add(new JTextField(16));

    contentPane.add(northJ, BorderLayout.NORTH);
    contentPane.add(centerJ, BorderLayout.CENTER);
    contentPane.add(southJ, BorderLayout.SOUTH);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 400);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice08();
  }
}
