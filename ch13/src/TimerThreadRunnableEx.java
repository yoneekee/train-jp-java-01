import java.awt.*;
import javax.swing.*;

class TimerThreadRunnable implements Runnable {

  private JLabel timerLabel;

  public TimerThreadRunnable(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }

  @Override
  public void run() {
    int num = 0;
    while (true) {
      timerLabel.setText("" + num);
      num++;
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.getStackTrace();
      }
    }
  }
}

public class TimerThreadRunnableEx extends JFrame {

  public TimerThreadRunnableEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel timeLabel = new JLabel();
    timeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 300));
    contentPane.add(timeLabel);

    TimerThreadRunnable runnable = new TimerThreadRunnable(timeLabel);
    Thread thread = new Thread(runnable);
    thread.start();

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new TimerThreadRunnableEx();
  }
}
