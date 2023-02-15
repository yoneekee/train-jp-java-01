import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDoubleClickEx extends JFrame {

  class MyMouseListener extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
      int clickCounts = e.getClickCount();
      Container c = (Container) e.getSource();
      if (clickCounts > 1 && c.getBackground() == Color.GREEN) {
        c.setBackground(Color.WHITE);
      } else if (clickCounts > 1) {
        c.setBackground(Color.GREEN);
      }
    }
  }

  public MouseDoubleClickEx() {
    this.setTitle("double click and back color will change");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.add(
      new JLabel("더블클릭:초록 / 다시 더블클릭:디폴트"),
      BorderLayout.CENTER
    );
    contentPane.addMouseListener(new MyMouseListener());
    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MouseDoubleClickEx();
  }
}
