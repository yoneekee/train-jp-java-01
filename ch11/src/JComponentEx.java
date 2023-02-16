import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {

  public JComponentEx() {
    this.setTitle("JComponent Common Methods");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JButton[] btns = new JButton[3];
    Color[] clrs = { Color.MAGENTA, Color.BLACK, Color.GREEN, Color.YELLOW };

    for (int i = 0; i < btns.length; i++) {
      btns[i] = new JButton("BTN" + (i + 1));
      btns[i].setBackground(clrs[i]);
      btns[i].setForeground(clrs[3]);
      btns[i].setFont(new Font("Arial", Font.PLAIN, 20));

      if (i == 1) {
        // btns[i].setEnabled(false); // 클릭막아두기
        btns[i].addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                System.out.println("aaa");
              }
            }
          );
      }

      if (i == 2) {
        btns[i].addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                btn.setText(btn.getX() + "/" + btn.getY());
                btn.setBackground(clrs[0]);
              }
            }
          );
      }

      contentPane.add(btns[i]);
    }

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JComponentEx();
  }
}
