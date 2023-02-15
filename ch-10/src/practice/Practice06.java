package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice06 extends JFrame {

  JLabel label = new JLabel("C");

  class MyMouseListener implements MouseListener, MouseMotionListener {

    public void mouseClicked(MouseEvent e) {
      int x = (int) (Math.random() * 400);
      int y = (int) (Math.random() * 400);
      label.setLocation(x, y);
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {}

    public void mouseMoved(MouseEvent e) {}
  }

  public Practice06() {
    this.setTitle("Practice 06");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    label.setFont(new Font("Arial", Font.PLAIN, 30));

    Container contentPane = this.getContentPane();
    label.addMouseListener(new MyMouseListener());
    label.addMouseMotionListener(new MyMouseListener());
    contentPane.setLayout(new FlowLayout());
    label.setLocation(100, 100);
    contentPane.add(label);

    this.setSize(500, 500);
    this.setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  public static void main(String[] args) {
    new Practice06();
  }
}
