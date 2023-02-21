package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel implements Runnable {

  private JPanel myPanel;

  int x = (int) (Math.random() * (450));
  int y = (int) (Math.random() * (450));

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.drawOval(x, y, 50, 50);
  }

  @Override
  public void run() {
    while (true) {
      try {
        myPanel = new JPanel();
        myPanel.setSize(500, 500);
        Thread.sleep(500);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class Practice02 extends JFrame {

  Practice02() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MyPanel myPanel = new MyPanel();
    this.setContentPane(myPanel);
    Thread th = new Thread(myPanel);

    myPanel.addMouseListener(
      new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          th.start();
          repaint();
        }
      }
    );
    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
