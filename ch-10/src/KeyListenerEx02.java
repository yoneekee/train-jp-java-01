import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx02 extends JFrame {

  private JLabel label = new JLabel();

  class MyKeyListener implements KeyListener {

    public void keyPressed(KeyEvent e) {
      //   int keyCode = e.getKeyCode();
      //   char keyChar = e.getKeyChar();
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}
  }

  public KeyListenerEx02() {
    this.setTitle("KeyListener");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.addKeyListener(new MyKeyListener());
    contentPane.add(label);

    this.setSize(300, 300);
    this.setVisible(true);
    contentPane.setFocusable(true); // 이게 있어야 키보드 입력 이벤트 가능
    contentPane.requestFocus(); // 이것도 마찬가지
  }

  public static void main(String[] args) {
    new KeyListenerEx02();
  }
}
