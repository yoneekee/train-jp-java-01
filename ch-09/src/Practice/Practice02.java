package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice02 extends JFrame {

  public Practice02() {
    setTitle("FLOW LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 200);
    setVisible(true);

    Container contentPane = getContentPane();

    contentPane.setLayout(new BorderLayout(5, 7)); // 여백
    contentPane.add(new JButton("NORTH"), BorderLayout.NORTH);
    contentPane.add(new JButton("SOUTH"), BorderLayout.SOUTH);
    contentPane.add(new JButton("WEST"), BorderLayout.WEST);
    contentPane.add(new JButton("EAST"), BorderLayout.EAST);
    contentPane.add(new JButton("CENTER"), BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
