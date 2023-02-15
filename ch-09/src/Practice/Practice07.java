package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice07 extends JFrame {

  public Practice07() {
    setTitle("Calc");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 400);
    setVisible(true);

    Container contentPane = getContentPane();

    JPanel northJ = new JPanel();
    northJ.setBackground(Color.gray);
    northJ.setSize(500, 50);
    northJ.setLayout(new FlowLayout());
    northJ.add(new JLabel("수식 입력"));
    northJ.add(new JTextField(16));

    JPanel centerJ = new JPanel();

    centerJ.setLayout(new GridLayout(4, 4, 5, 5));

    for (int i = 0; i < 10; i++) {
      JButton btn = new JButton(" " + i);
      centerJ.add(btn);
    }

    String mark[] = { "CE", "계산", "+", "-", "x", "/" };

    for (int i = 0; i < mark.length; i++) {
      if (i >= 0 || i < 2) {
        JButton btn = new JButton(mark[i]);
        centerJ.add(btn);
      } else if (i >= 2 || i < mark.length) {
        JButton btn = new JButton(mark[i]);
        centerJ.add(btn).setBackground(Color.GREEN);
      }
    }

    JPanel southJ = new JPanel();

    southJ.setBackground(Color.yellow);
    southJ.setSize(500, 50);
    southJ.setLayout(new FlowLayout());
    southJ.add(new JLabel("계산 결과"));
    southJ.add(new JTextField(16));

    contentPane.add(northJ, BorderLayout.NORTH);
    contentPane.add(centerJ, BorderLayout.CENTER);
    contentPane.add(southJ, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    new Practice07();
  }
}
