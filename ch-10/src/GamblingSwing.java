import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamblingSwing extends JFrame {

  JLabel[] nums = new JLabel[3];
  JLabel result = new JLabel("result");

  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      //Container c = (Container) e.getSource();

      int[] numsCheck = new int[3];

      if (keyCode == KeyEvent.VK_ENTER) {
        for (int i = 0; i < 3; i++) {
          int num = Integer.parseInt(nums[i].getText());
          numsCheck[i] = num;
        }
      }
      String resultShow = "당첨입니다";

      result.setText(resultShow);
    }
  }

  public GamblingSwing() {
    this.setTitle("바다이야기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.addKeyListener(new MyKeyListener());

    for (int i = 0; i < 3; i++) {
      nums[i] = new JLabel(Integer.toString((int) (Math.random() * 5)));
      nums[i].setSize(20, 20);
      nums[i].setBackground(Color.MAGENTA);
      contentPane.add(nums[i]);
    }

    contentPane.add(result);
    result.setLocation(0, 200);
    this.setSize(500, 500);
    this.setVisible(true);

    contentPane.setFocusable(true); // 이게 있어야 키보드 입력 이벤트 가능
    contentPane.requestFocus(); // 이것도 마찬가지
  }

  public static void main(String[] args) {
    new GamblingSwing();
  }
}
