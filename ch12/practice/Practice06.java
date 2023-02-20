package ch12.practice;

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Practice06 extends JFrame {

  private MyPanel myPanel = new MyPanel();

  class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLUE);
      /* 
      for (int i = 0; i < 500; i++) {
        g.drawLine(i, 0, i, 500);
        i += 50;
      }

      for (int i = 0; i < 500; i++) {
        g.drawLine(0, i, 500, i);
        i += 50;
      }
    */
      for (int i = 0; i < 500; i++) {
        //public void drawRect(int x, int y, int width, int height)

        //i += 50;
      }
      //g.drawPolygon(10, 10, 10);
    }
  }

  public Practice06() {
    this.setTitle("Paint Component");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setContentPane(myPanel);
    //Container contentPane = this.getContentPane();

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice06();
  }
}
