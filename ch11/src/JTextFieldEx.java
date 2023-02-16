import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldEx extends JFrame {

  private JTextField textField = new JTextField(20);
  private JTextArea textArea = new JTextArea(10, 20);

  public JTextFieldEx() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    /*
    contentPane.add(new JLabel("이름"));
    contentPane.add(new JTextField(20));
    contentPane.add(new JLabel("학과"));
    contentPane.add(new JTextField(20));
    */

    contentPane.add(textField);
    contentPane.add(textArea);
    contentPane.add(
      new JScrollPane(
        textArea,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
      )
    );

    textField.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          JTextField t = (JTextField) e.getSource();
          textArea.append(t.getText() + "\n");
          t.setText("");
        }
      }
    );

    this.setSize(300, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new JTextFieldEx();
  }
}
