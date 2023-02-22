import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CirclePanel extends JPanel implements Runnable {

  private int x = 100;
  private int y = 100;

  CirclePanel() {
    Thread th = new Thread(this);
    this.addMouseListener(
        new MouseAdapter() {
          public void mouseReleased(MouseEvent e) {
            th.start();
          }
        }
      );
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawOval(x, y, 50, 50);
  }

  @Override
  public void run() {
    while (true) {
      x = (int) (Math.random() * 450);
      y = (int) (Math.random() * 450);
      repaint();
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class RandomCircle extends JFrame {

  RandomCircle() {
    this.setTitle("시계");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CirclePanel cp = new CirclePanel();
    this.setContentPane(cp);
    cp.setForeground(Color.RED);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new RandomCircle();
  }
}
