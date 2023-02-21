import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {

  private int delay;

  FlickeringLabel(String txt, int delay) {
    super(txt);
    this.delay = delay;
    this.setOpaque(true);
  }

  @Override
  public void run() {
    int num = 0;
    while (true) {
      if (num % 2 == 0) {
        setBackground(Color.YELLOW);
      } else {
        setBackground(Color.GREEN);
      }
      num++;
      try {
        Thread.sleep(delay);
      } catch (Exception e) {
        e.printStackTrace();
        return; // 오류 발생 시 종료한다
      }
    }
  }
}

public class FlickeringLabelEx extends JFrame {

  public FlickeringLabelEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    FlickeringLabel fLabel = new FlickeringLabel("Flicker", 1000);
    fLabel.setFont(new Font("맑은 고딕", Font.BOLD, 120));
    contentPane.add(fLabel);

    Thread th = new Thread(fLabel);
    th.start();

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlickeringLabelEx();
  }
}
