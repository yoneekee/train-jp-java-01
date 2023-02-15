package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice00 extends JFrame {

  public Practice00() {
    setTitle("Grid Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 200);
    setVisible(true);

    // GridLayout grid = new GridLayout(4, 2); // grid.setVgap(5);
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4, 2, 10, 10)); // 여백

    contentPane.add(new JLabel(" 이름"));
    contentPane.add(new JTextField(""));
    contentPane.add(new JLabel(" 학번"));
    contentPane.add(new JTextField(""));
    contentPane.add(new JLabel(" 학과"));
    contentPane.add(new JTextField(""));
    contentPane.add(new JLabel(" 과목"));
    contentPane.add(new JTextField(""));
  }

  public static void main(String[] args) {
    new Practice00();
  }
}
