package ch12.practice;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

class MyPanel extends JPanel {

  private Vector<Point> vStart = new Vector<>();
  private Vector<Point> vEnd = new Vector<>();

  MyPanel() {
    this.addMouseMotionListener(
        new MouseAdapter() {
          public void mouseMoved(MouseEvent e) {}

          public void mouseDragged(MouseEvent e) {}
        }
      );
    this.addMouseListener(
        new MouseAdapter() {
          public void mousePressed(MouseEvent e) {
            Point startPoint = e.getPoint();
            vStart.add(startPoint);
          }

          public void mouseReleased(MouseEvent e) {
            Point endPoint = e.getPoint();
            vEnd.add(endPoint);
            repaint(); // 꼭 필요
          }
        }
      );
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(new Color(0x99ccff));
    for (int i = 0; i < vStart.size(); i++) {
      Point start = vStart.elementAt(i);
      Point end = vEnd.elementAt(i);
      g.drawLine(
        (int) start.getX(),
        (int) start.getY(),
        (int) end.getX(),
        (int) end.getY()
      );
    }
  }
}

public class Practice08 extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public Practice08() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);
    this.setSize(500, 500);
    this.setVisible(true);
  }
}
