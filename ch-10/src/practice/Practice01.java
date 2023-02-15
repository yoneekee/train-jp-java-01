package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice01 extends JFrame {

  JLabel label = new JLabel("Love Java");

  // 인터페이스는 이중상속(구현) 가능
  class MyMouseListener implements MouseListener, MouseMotionListener {

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
      label.setText("자바 사랑");
    }

    public void mouseExited(MouseEvent e) {
      label.setText("Love Java");
    }

    public void mouseDragged(MouseEvent e) {}

    public void mouseMoved(MouseEvent e) {}
  }

  public Practice01() {
    this.setTitle("All Mouse Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    label.addMouseListener(new MyMouseListener());
    label.addMouseMotionListener(new MyMouseListener());
    contentPane.setLayout(new FlowLayout());
    contentPane.add(label);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
