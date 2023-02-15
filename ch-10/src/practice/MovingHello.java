package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingHello extends JFrame {

  private JLabel label = new JLabel("Hello");
  private int moving = 10;

  class MyMouseAdapter extends MouseAdapter {

    // 마우스 찍은 위치로 Hello 옮기기
    public void mousePressed(MouseEvent e) {
      //super.mousePressed(e);
      int x = e.getX();
      int y = e.getY();
      label.setLocation(x, y);
    }
  }

  class MyKeyListener extends KeyAdapter {

    // 상하좌우 키로 Hello 옮기기
    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();

      if (keyCode == KeyEvent.VK_UP) {
        label.setLocation(label.getX(), label.getY() - moving);
      } else if (keyCode == KeyEvent.VK_DOWN) {
        label.setLocation(label.getX(), label.getY() + moving);
      } else if (keyCode == KeyEvent.VK_LEFT) {
        label.setLocation(label.getX() - moving, label.getY());
      } else if (keyCode == KeyEvent.VK_RIGHT) {
        label.setLocation(label.getX() + moving, label.getY());
      }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}
  }

  public MovingHello() {
    this.setTitle("KeyListener");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    // 마우스 찍은 위치로 Hello 옮기기
    contentPane.addMouseListener(new MyMouseAdapter());
    // 상하좌우 키로 Hello 옮기기
    contentPane.addKeyListener(new MyKeyListener());
    contentPane.add(label);

    this.setSize(300, 300);
    this.setVisible(true);
    contentPane.setFocusable(true); // 이게 있어야 키보드 입력 이벤트 가능
    contentPane.requestFocus(); // 이것도 마찬가지
  }

  public static void main(String[] args) {
    new MovingHello();
  }
}
