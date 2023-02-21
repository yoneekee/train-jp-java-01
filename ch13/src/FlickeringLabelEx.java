import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {

  private int delay;

  FlickeringLabel(String txt, int delay) {
    super(txt);
    this.delay = delay;
    this.setOpaque(true);
    Thread th = new Thread(this);
    th.start();
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
    FlickeringLabel fLabel2 = new FlickeringLabel("Flicker", 300);
    JLabel label = new JLabel();
    label.setText("not flickering");
    contentPane.add(fLabel);
    contentPane.add(label);
    contentPane.add(fLabel2);

    // Thread th = new Thread(fLabel);
    // th.start();
    // Thread th2 = new Thread(fLabel2);
    // th2.start();

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlickeringLabelEx();
  }
}
