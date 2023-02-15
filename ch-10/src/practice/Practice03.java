package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  StringBuffer loveJava0 = new StringBuffer("Love Java");
  String loveJava = loveJava0.toString();
  String loveJavaR = loveJava0.reverse().toString();
  JLabel label = new JLabel(loveJava.toString());

  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();

      if (keyCode == KeyEvent.VK_LEFT) {
        if (label.getText().equals(loveJava)) {
          label.setText(loveJavaR);
        } else {
          label.setText(loveJava);
        }
      }
    }
  }

  public Practice03() {
    this.setTitle("All Mouse Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();

    //contentPane.addMouseListener(new MyMouseListener());
    //contentPane.addMouseMotionListener(new MyMouseListener());
    contentPane.addKeyListener(new MyKeyListener());
    contentPane.setLayout(new FlowLayout());
    contentPane.add(label);

    this.setSize(500, 500);
    this.setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
