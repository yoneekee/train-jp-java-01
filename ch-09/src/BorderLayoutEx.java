import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {

  public BorderLayoutEx() {
    setTitle("FLOW LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

    Container contentPane = getContentPane();

    contentPane.setLayout(new BorderLayout(20, 20)); // 여백
    contentPane.add(new JButton("add"), BorderLayout.NORTH);
    contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
    contentPane.add(new JButton("mul"), BorderLayout.WEST);
    contentPane.add(new JButton("div"), BorderLayout.EAST);
    contentPane.add(new JButton("calc"), BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    new BorderLayoutEx();
  }
}
