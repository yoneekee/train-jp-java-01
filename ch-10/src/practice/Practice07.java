package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice07 extends JFrame {

  JLabel label = new JLabel("Love Java");

  public Practice07() {
    this.setTitle("Practice 06");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    label.setFont(new Font("Arial", Font.PLAIN, 30));

    Container contentPane = this.getContentPane();

    contentPane.addMouseWheelListener(
      new MouseWheelListener() {
        public void mouseWheelMoved(MouseWheelEvent e) {
          int n = e.getWheelRotation();
          Font f = label.getFont();
          int size = f.getSize();

          if (n < 0 && size > 10) {
            label.setFont(new Font("Arial", Font.PLAIN, size - 5));
          } else if (n > 0 && size < 168) {
            label.setFont(new Font("Arial", Font.PLAIN, size + 5));
          }
        }
      }
    );

    contentPane.setLayout(new FlowLayout());
    label.setLocation(100, 100);
    contentPane.add(label);

    this.setSize(500, 500);
    this.setVisible(true);
    // contentPane.setFocusable(true);
    // contentPane.requestFocus();
  }

  public static void main(String[] args) {
    new Practice07();
  }
}
