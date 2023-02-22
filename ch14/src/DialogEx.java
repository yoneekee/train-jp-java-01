import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDialog extends JDialog {

  private JTextField tf = new JTextField(10);
  private JButton btn = new JButton("OK");

  MyDialog(JFrame frame, String title) {
    super(frame, title, true);
    setLayout(new FlowLayout());
    this.add(tf);
    this.add(btn);
    this.setSize(300, 300);
    btn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          setVisible(false);
          System.out.println(tf.getText());
        }
      }
    );
  }
}

public class DialogEx extends JFrame {

  private MyDialog myD;

  DialogEx() {
    this.setTitle("title");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    //contentPane.setLayout(new FlowLayout());
    JButton btn = new JButton("Click then POP UP");
    myD = new MyDialog(this, "dialog");
    contentPane.add(btn);
    btn.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          myD.setVisible(true);
        }
      }
    );
    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new DialogEx();
  }
}
