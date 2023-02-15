package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice04 extends JFrame {

  String loveJava = "Love Java";
  String cutChar = "";
  String leftChars = "";
  JLabel label = new JLabel(loveJava.toString());

  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();

      if (keyCode == KeyEvent.VK_LEFT) {
        cutChar = loveJava.substring(0, 1);
        leftChars = loveJava.substring(1);
        loveJava = leftChars + cutChar;
        label.setText(loveJava);
      }
    }
  }

  public Practice04() {
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
    new Practice04();
  }
}
