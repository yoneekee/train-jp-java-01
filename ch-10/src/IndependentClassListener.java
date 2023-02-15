import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyActionListener implements ActionListener {

  public void gugudanOut(int dan) {
    for (int j = 1; j <= 9; j++) {
      int result = dan * j;
      System.out.println(dan + " x " + j + " = " + result);
    }
    System.out.println();
  }

  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource(); // 선택된 구구단 버튼

    if (button.getText().equals("1")) {
      button.setText("One");
      gugudanOut(1);
    } else if (button.getText().equals("2")) {
      button.setText("Two");
      gugudanOut(2);
    } else if (button.getText().equals("3")) {
      button.setText("Three");
      gugudanOut(3);
    } else if (button.getText().equals("4")) {
      button.setText("Four");
      gugudanOut(4);
    } else if (button.getText().equals("5")) {
      button.setText("Five");
      gugudanOut(5);
    } else if (button.getText().equals("6")) {
      button.setText("Six");
      gugudanOut(6);
    } else if (button.getText().equals("7")) {
      button.setText("Seven");
      gugudanOut(7);
    } else if (button.getText().equals("8")) {
      gugudanOut(8);
      button.setText("Eight");
    } else if (button.getText().equals("9")) {
      gugudanOut(9);
      button.setText("Nine");
    } else {
      System.out.println();
    }
  }
}

public class IndependentClassListener extends JFrame {

  public IndependentClassListener() {
    this.setTitle("Action Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(3, 3, 10, 10));

    JButton btn[] = new JButton[9];

    for (int i = 0; i < 9; i++) {
      btn[i] = new JButton(Integer.toString(i + 1));
      contentPane.add(btn[i]);
    }

    for (int i = 0; i < btn.length; i++) {
      btn[i].addActionListener(new MyActionListener());
    }

    for (int i = 0; i < btn.length; i++) {
      contentPane.add(btn[i]);
    }

    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new IndependentClassListener();
  }
}
