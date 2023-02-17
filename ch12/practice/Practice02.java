package ch12.practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice02 extends JFrame {

  private MyPanel myPanel = new MyPanel();

  class MyPanel extends JPanel {

    private ImageIcon icon = new ImageIcon("ch12/images/cat.png");
    private Image img = icon.getImage();
    private int ovalX = 100;
    private int ovalY = 100;

    MyPanel() {
      this.addMouseMotionListener(
          new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
              ovalX = e.getX();
              ovalY = e.getY();
              repaint();
            }
          }
        );
    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
      g.setColor(Color.GREEN);
      g.fillOval(ovalX, ovalY, 30, 30);
    }
  }

  public Practice02() {
    this.setTitle("Drawing");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(myPanel);
    //Container contentPane = this.getContentPane();
    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
