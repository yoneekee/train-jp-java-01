package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice05 extends JFrame {

  public Practice05() {
    setTitle("GRID LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setVisible(true);

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4, 4, 1, 1)); // 여백
    contentPane.add(new JButton("1")).setBackground(Color.red);
    contentPane.add(new JButton("2")).setBackground(Color.orange);
    contentPane.add(new JButton("3")).setBackground(Color.yellow);
    contentPane.add(new JButton("4")).setBackground(Color.green);
    contentPane.add(new JButton("5")).setBackground(Color.cyan);
    contentPane.add(new JButton("6")).setBackground(Color.blue);
    contentPane.add(new JButton("7")).setBackground(Color.GRAY);
    contentPane.add(new JButton("8")).setBackground(Color.PINK);
    contentPane.add(new JButton("9")).setBackground(Color.LIGHT_GRAY);
    contentPane.add(new JButton("10")).setBackground(Color.green);
    contentPane.add(new JButton("11")).setBackground(Color.WHITE);
    contentPane.add(new JButton("12")).setBackground(Color.BLACK);
    contentPane.add(new JButton("13")).setBackground(Color.DARK_GRAY);
    contentPane.add(new JButton("14")).setBackground(Color.ORANGE);
    contentPane.add(new JButton("15")).setBackground(Color.BLUE);
    contentPane.add(new JButton("16")).setBackground(Color.magenta);
  }

  public static void main(String[] args) {
    new Practice05();
  }
}
