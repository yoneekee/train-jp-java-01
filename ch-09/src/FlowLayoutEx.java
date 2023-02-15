import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {

  public FlowLayoutEx() {
    setTitle("FLOW LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

    Container contentPane = getContentPane();

    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 30)); // 왼쪽 정렬 + 여백
    contentPane.setBackground(Color.orange);

    contentPane.add(new JButton("add"));
    contentPane.add(new JButton("sub"));
    contentPane.add(new JButton("mul"));
    contentPane.add(new JButton("div"));
    contentPane.add(new JButton("calc"));
  }

  public static void main(String[] args) {
    new FlowLayoutEx();
  }
}
