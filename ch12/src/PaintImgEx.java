import java.awt.*;
import javax.swing.*;

public class PaintImgEx extends JFrame {

  private MyPanel myPanel = new MyPanel();

  public PaintImgEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setContentPane(myPanel);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  class MyPanel extends JPanel {

    private ImageIcon icon = new ImageIcon("ch12/images/photo-camera.png");
    private Image img = icon.getImage();

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setClip(100, 100, 250, 250);
      g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
  }

  public static void main(String[] args) {
    new PaintImgEx();
  }
}
