import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class JLabelEx extends JFrame {

  public JLabelEx() {
    this.setTitle("JLabelEx");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();

    contentPane.setLayout(new FlowLayout());

    JLabel txtLabel = new JLabel("I Love JAVA");
    ImageIcon imgIcon = new ImageIcon("ch11/Images/heart.png");
    JLabel imgLabel01 = new JLabel(new ImageIcon("ch11/Images/heart.png"));
    JLabel imgLabel02 = new JLabel(new ImageIcon("ch11/Images/phone.png"));
    JLabel imgLabel03 = new JLabel("love", imgIcon, SwingConstants.CENTER);

    contentPane.add(txtLabel);
    contentPane.add(imgLabel01);
    contentPane.add(imgLabel02);
    contentPane.add(imgLabel03);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JLabelEx();
  }
}
