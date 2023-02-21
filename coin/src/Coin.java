import javax.swing.*;

public class Coin extends JFrame {

  public Coin() {
    this.setTitle("Coin Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GamePanel gamePanel = new GamePanel();
    this.setContentPane(gamePanel);
    this.setVisible(true);
    this.pack(); // 크기를 맞춰줌
    this.setResizable(false);
  }

  public static void main(String[] args) {
    new Coin();
  }
}
