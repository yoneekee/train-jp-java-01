package ETC;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GugudanSwing extends JFrame implements ActionListener {

  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
  int i, result = 0;

  public GugudanSwing() {
    setTitle("구구단");
    makeBody();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(250, 250);
    setVisible(true);
  }

  void makeBody() {
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);

    setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
  }

  public static void main(String[] args) {
    new GugudanSwing();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object o = e.getSource();
    if (o == b1) {
      for (i = 1; i < 10; i++) {
        result = i * 1;

        System.out.print("1*" + i + "=" + result + "\n");
      }
      System.out.println();
    } else if (o == b2) {
      for (i = 1; i < 10; i++) {
        result = i * 2;
        System.out.print("2*" + i + "=" + result + "\n");
      }
      System.out.println();
    } else if (o == b3) {
      for (i = 1; i < 10; i++) {
        result = i * 3;

        System.out.print("3*" + i + "=" + result + "\n");
      }
      System.out.println();
    } else if (o == b4) {
      for (i = 1; i < 10; i++) {
        result = i * 4;

        System.out.print("4*" + i + "=" + result + "\n");
      }
      System.out.println();
    } else if (o == b5) {
      for (i = 1; i < 10; i++) {
        result = i * 5;

        System.out.print("5*" + i + "=" + result + " ");
      }
      System.out.println();
    } else if (o == b6) {
      for (i = 1; i < 10; i++) {
        result = i * 6;

        System.out.print("6*" + i + "=" + result + "\n");
      }
      System.out.println();
    } else if (o == b7) {
      for (i = 1; i < 10; i++) {
        result = i * 7;

        System.out.print("7*" + i + "=" + result + "\n");
      }
      System.out.println();
    } else if (o == b8) {
      for (i = 1; i < 10; i++) {
        result = i * 8;

        System.out.print("8*" + i + "=" + result + " ");
      }
      System.out.println();
    } else if (o == b9) {
      for (i = 1; i < 10; i++) {
        result = i * 9;

        System.out.print("9*" + i + "=" + result + "\n");
      }
      System.out.println();
    }
  }
}
