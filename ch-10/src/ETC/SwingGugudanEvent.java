package ETC;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyActionListener implements ActionListener {

  public void gugudanOut(int dan) {
    for (int j = 1; j <= 9; j++) {
      int result = dan * j;
      System.out.println(dan + " * " + j + " = " + result);
    }
    System.out.println();
  }

  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource(); // 선택된 구구단 버튼

    if (button.getText().equals("1")) {
      this.gugudanOut(1);
    } else if (button.getText().equals("2")) {
      gugudanOut(2);
    } else if (button.getText().equals("3")) {
      gugudanOut(3);
    } else if (button.getText().equals("4")) {
      gugudanOut(4);
    } else if (button.getText().equals("5")) {
      gugudanOut(5);
    } else if (button.getText().equals("6")) {
      gugudanOut(6);
    } else if (button.getText().equals("7")) {
      gugudanOut(7);
    } else if (button.getText().equals("8")) {
      gugudanOut(8);
    } else if (button.getText().equals("9")) {
      gugudanOut(9);
    } else {
      System.out.println();
    }
  }
}

public class SwingGugudanEvent extends JFrame {

  public SwingGugudanEvent() {
    this.setTitle("Action Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(3, 3, 5, 5));

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
    new SwingGugudanEvent();
  }
}
