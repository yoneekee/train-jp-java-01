import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame {

  JLabel label = new JLabel("No Mouse Event");

  // 인터페이스는 이중상속(구현) 가능
  class MyMouseListener implements MouseListener, MouseMotionListener {

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
      label.setText("Mouse Pressed / " + e.getX() + " / " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
      label.setText("Mouse Released / " + e.getX() + " / " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {
      label.setText("Mouse Dragged / " + e.getX() + " / " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
      label.setText("Mouse Moved / " + e.getX() + " / " + e.getY());
    }
  }

  public MouseListenerAllEx() {
    this.setTitle("All Mouse Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addMouseListener(new MyMouseListener());
    contentPane.addMouseMotionListener(new MyMouseListener());
    contentPane.setLayout(new BorderLayout());
    contentPane.add(label, BorderLayout.CENTER);

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MouseListenerAllEx();
  }
}
