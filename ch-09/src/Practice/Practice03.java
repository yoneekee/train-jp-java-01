package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  public Practice03() {
    setTitle("GRID LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

    Container contentPane = getContentPane();

    contentPane.setLayout(new GridLayout(0, 9, 1, 1)); // 여백
    contentPane.add(new JButton("1"));
    contentPane.add(new JButton("2"));
    contentPane.add(new JButton("3"));
    contentPane.add(new JButton("4"));
    contentPane.add(new JButton("5"));
    contentPane.add(new JButton("6"));
    contentPane.add(new JButton("7"));
    contentPane.add(new JButton("8"));
    contentPane.add(new JButton("9"));
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
