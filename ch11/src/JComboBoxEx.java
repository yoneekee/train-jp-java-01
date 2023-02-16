import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame {

  private String fruits[] = {
    "apple",
    "banana",
    "kiwi",
    "orange",
    "melon",
    "apple",
    "banana",
    "kiwi",
    "orange",
    "melon",
  };

  private ImageIcon images[] = {
    new ImageIcon("ch11/images/heart.png"),
    new ImageIcon("ch11/images/phone.png"),
    new ImageIcon("ch11/images/heart.png"),
    new ImageIcon("ch11/images/phone.png"),
    new ImageIcon("ch11/images/heart.png"),
    new ImageIcon("ch11/images/phone.png"),
  };

  public JComboBoxEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JComboBox<String> strList = new JComboBox<>(fruits);

    contentPane.add(strList);
    contentPane.add(new JScrollPane(strList));
    JComboBox<ImageIcon> imgList = new JComboBox<>(images);

    contentPane.add(imgList);
    contentPane.add(new JScrollPane(imgList));

    this.setSize(300, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JComboBoxEx();
  }
}
