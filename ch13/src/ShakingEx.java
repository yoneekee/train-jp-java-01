//import java.awt.*;
import javax.swing.*;

class Shaking extends JLabel implements Runnable {

  //   private int x = 100;
  //   private int y = 100;
  private boolean state = false;

  Shaking() {
    Thread th = new Thread(this);
    th.start();
  }

  @Override
  public void run() {
    while (true) {
      setText("진동 레이블");

      state = !state;

      if (state) {
        setLocation(100, 100);
      } else {
        setLocation(90, 90);
      }
      //   if (x == 100 && y == 100) {
      //     setLocation(x, y);
      //     x -= 5;
      //     y -= 5;
      //   } else if (y == 95 && x == 95) {
      //     setLocation(x, y);
      //     x += 5;
      //     y += 5;
      //   }
      try {
        Thread.sleep(50);
      } catch (Exception e) {
        e.printStackTrace();
        return;
      }
    }
  }
}

public class ShakingEx extends JFrame {

  ShakingEx() {
    this.setTitle("시계");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Shaking sk = new Shaking();
    this.setContentPane(sk);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new ShakingEx();
  }
}
