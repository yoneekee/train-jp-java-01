import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {

  class myMouseAdapter extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
      System.out.println("Connected..");
    }
  }

  private JLabel label = new JLabel("hello");

  public MouseAdapterEx() {
    this.setTitle("Mouse Adapter");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();

    contentPane.addMouseListener(new myMouseAdapter());
    contentPane.setLayout(null);

    label.setLocation(100, 100);
    label.setSize(50, 20);
    contentPane.add(label);

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MouseAdapterEx();
  }
}
