import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable implements Runnable {

  private JLabel timerLabel;
  private boolean flag = false;

  TimerRunnable(JLabel timerLabel) {
    this.timerLabel = timerLabel;
  }

  public void finish() {
    flag = true;
  }

  @Override
  public void run() {
    int num = 0;
    while (true) {
      timerLabel.setText("" + num);
      num++;
      try {
        Thread.sleep(1000);
        if (flag) {
          return; // 종료시켜버린다 (빠져나가게)
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class TimerThreadInterrupt extends JFrame {

  TimerThreadInterrupt() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel timeLabel = new JLabel();
    timeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 300));
    contentPane.add(timeLabel);

    TimerRunnable runnable = new TimerRunnable(timeLabel);
    Thread thread = new Thread(runnable);
    thread.start();

    JButton btn = new JButton("TIMER 종료");
    contentPane.add(btn);
    btn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          runnable.finish();
          //thread.interrupt(); // 예외 발생하면서 스레드 종료
        }
      }
    );

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new TimerThreadInterrupt();
  }
}
