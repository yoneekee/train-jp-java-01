package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice02 extends JFrame {

  JTextField textField = new JTextField(5);
  JComboBox<String> textArea = new JComboBox<>();
  JScrollPane sp = new JScrollPane(textArea);

  public Practice02() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    contentPane.add(textField);
    contentPane.add(textArea);
    contentPane.add(sp);

    textField.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          JTextField t = (JTextField) e.getSource();
          textArea.addItem(t.getText());
          t.setText("");
        }
      }
    );

    this.setSize(500, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
