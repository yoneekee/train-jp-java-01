import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx extends JFrame {

  private JLabel[] keyMessages;

  class MyKeyListener implements KeyListener {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      char keyChar = e.getKeyChar();

      keyMessages[0].setText(Integer.toString(keyCode));
      keyMessages[1].setText(Character.toString(keyChar));
      keyMessages[2].setText(KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}
  }

  public KeyListenerEx() {
    this.setTitle("KeyListener");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.addKeyListener(new MyKeyListener());
    keyMessages = new JLabel[3];
    keyMessages[0] = new JLabel("getKeyCode");
    keyMessages[1] = new JLabel("getKeyChar");
    keyMessages[2] = new JLabel("getKeyText");
    for (int i = 0; i < keyMessages.length; i++) {
      contentPane.add(keyMessages[i]);
      keyMessages[i].setOpaque(true); // 불투명처리
      keyMessages[i].setBackground(Color.RED); // 투명하면 배경색 안보임
    }
    this.setSize(300, 300);
    this.setVisible(true);
    contentPane.setFocusable(true); // 이게 있어야 키보드 입력 이벤트 가능
    contentPane.requestFocus(); // 이것도 마찬가지
  }

  public static void main(String[] args) {
    new KeyListenerEx();
  }
}
