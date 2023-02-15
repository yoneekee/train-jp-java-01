package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice04 extends JFrame {

  public Practice04() {
    setTitle("GRID LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(0, 9, 1, 1)); // 여백
    contentPane.add(new JButton("1")).setBackground(Color.red);
    contentPane.add(new JButton("2")).setBackground(Color.orange);
    contentPane.add(new JButton("3")).setBackground(Color.yellow);
    contentPane.add(new JButton("4")).setBackground(Color.green);
    contentPane.add(new JButton("5")).setBackground(Color.cyan);
    contentPane.add(new JButton("6")).setBackground(Color.blue);
    contentPane.add(new JButton("7")).setBackground(Color.GRAY);
    contentPane.add(new JButton("8")).setBackground(Color.PINK);
    contentPane.add(new JButton("9")).setBackground(Color.LIGHT_GRAY);
  }

  public static void main(String[] args) {
    new Practice04();
  }
}
