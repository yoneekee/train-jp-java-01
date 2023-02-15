import java.awt.*;
import javax.swing.*;

public class NullLayoutEx extends JFrame {

  public NullLayoutEx() {
    setTitle("NULL LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

    Container contentPane = getContentPane();

    contentPane.setLayout(null);
    // null로 설정하면 하나하나 내가 다 차후 설정 해야 함

    JLabel label = new JLabel("hello");
    // label.setLocation(100, 100);
    // label.setSize(200, 20);
    label.setBounds(100, 100, 200, 30);
    contentPane.add(label);

    for (int i = 0; i < 10; i++) {
      JButton button = new JButton(Integer.toString(i));
      button.setLocation(200, i * 20 + 50);
      button.setSize(50, 15);
      contentPane.add(button);
    }
  }

  public static void main(String[] args) {
    new NullLayoutEx();
  }
}
