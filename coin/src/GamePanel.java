import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

  Image bg = new ImageIcon("coin/images/bg.jpg").getImage();
  Image coin = new ImageIcon("coin/images/dollar.png").getImage();
  Image mario = new ImageIcon("coin/images/super-mario.png").getImage();

  public boolean isLeft, isRight, isUp, isDown;
  public int marioX = 500;
  public int marioY = 500;
  public int coinX = 300;
  public int coinY = 300;
  public int speedX = 10;
  public int speedY = 10;
  public int score = 0;
  public boolean isStart = true;

  public Thread th;
  public Thread th2;

  public GamePanel() {
    th = new Thread(this);
    th2 =
      new Thread(
        new Runnable() {
          public void run() {
            while (true) {
              try {
                Thread.sleep(3000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              coinRandomlyMove();
            }
          }
        }
      );
    th.start(); // 이게 있어야 스레드가 구동이 됨
    th2.start();

    this.setPreferredSize(new Dimension(1280, 720));
    this.addKeyListener(
        new KeyListener() {
          public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
              isStart = false;
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = true;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = true;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = true;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = true;
            }
          }

          public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              isLeft = false;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              isRight = false;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
              isUp = false;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              isDown = false;
            }
          }

          public void keyTyped(KeyEvent e) {}
        }
      );

    this.setFocusable(true); // 이게 있어야 키보드 입력 이벤트 가능
    this.requestFocus(); // 이것도 마찬가지
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(20);
      } catch (Exception e) {
        e.getStackTrace();
      }
      repaint();
      checkCoin();
      marioMove();
    }
  }

  public void paintComponent(Graphics g) {
    if (isStart) {
      g.drawImage(bg, 0, 0, null);
      g.setColor(Color.BLACK);
      g.drawRect(0, 0, 618, 900);
      g.setColor(Color.WHITE);
      g.setFont(new Font("맑은 고딕", Font.BOLD, 32));
      g.drawString("MARIO COIN GAME", 60, 450);
      g.setFont(new Font("맑은 고딕", Font.BOLD, 24));
      g.drawString("PRESS ENTER FOR GAME TO START ", 60, 550);
    } else {
      g.drawImage(bg, 0, 0, null);
      g.drawImage(coin, coinX, coinY, null);
      g.drawImage(mario, marioX, marioY, null);
      g.setColor(Color.WHITE);
      g.setFont(new Font("맑은 고딕", Font.BOLD, 16));
      g.drawString("SCORE : " + score, 20, 20);
    }
    // 그림 그리는 곳

  }

  public void marioMove() {
    if (isLeft) {
      marioX -= speedX;
    }
    if (isRight) {
      marioX += speedX;
    }
    if (isUp) {
      marioY -= speedY;
    }
    if (isDown) {
      marioY += speedY;
    }
  }

  public void checkCoin() {
    double distX = (coinX - 16) - (marioX - 16);
    double distY = (coinY - 16) - (marioY - 16);
    double dist = Math.sqrt(distX * distX + distY * distY);

    if (dist < 32) {
      coinX = (int) (Math.random() * 1000);
      coinY = (int) (Math.random() * 700);
      score += 20;
    }
  }

  public void coinRandomlyMove() {
    //System.out.println("coin randomly move");
    coinX = (int) (Math.random() * 1000);
    coinY = (int) (Math.random() * 700);
  }
}
