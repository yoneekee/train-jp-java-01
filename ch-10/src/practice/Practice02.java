package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice02 extends JFrame {

  JLabel label = new JLabel("Love Java");

  // 인터페이스는 이중상속(구현) 가능
  class MyMouseListener implements MouseListener, MouseMotionListener {

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.GREEN);
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {
      Container contentPane = (Container) e.getSource();
      contentPane.setBackground(Color.YELLOW);
    }

    public void mouseMoved(MouseEvent e) {}
  }

  public Practice02() {
    Container contentPane = this.getContentPane();

    this.setTitle("All Mouse Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane.setBackground(Color.GREEN);
    contentPane.addMouseListener(new MyMouseListener());
    contentPane.addMouseMotionListener(new MyMouseListener());
    contentPane.setLayout(new FlowLayout());
    contentPane.add(label);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
