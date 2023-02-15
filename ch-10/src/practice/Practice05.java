package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice05 extends JFrame {

  JLabel label = new JLabel("Love Java");

  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      String keyChar = Character.toString(e.getKeyChar());
      Font f = label.getFont();
      int size = f.getSize();

      if (keyChar.equals("+")) {
        if (size < 84) {
          label.setFont(new Font("Arial", Font.PLAIN, size + 5));
        }
      }

      if (keyChar.equals("-")) {
        if (size > 10) {
          label.setFont(new Font("Arial", Font.PLAIN, size - 5));
        }
      }
    }
  }

  public Practice05() {
    this.setTitle("All Mouse Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    label.setFont(new Font("Arial", Font.PLAIN, 10));

    Container contentPane = this.getContentPane();
    contentPane.addKeyListener(new MyKeyListener());
    contentPane.setLayout(new FlowLayout());
    contentPane.add(label);

    this.setSize(500, 500);
    this.setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  public static void main(String[] args) {
    new Practice05();
  }
}
