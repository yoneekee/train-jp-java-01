package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice03 extends JFrame {

  Container contentPane = this.getContentPane();
  JPanel titlePanel = new JPanel();
  JPanel mainPanel = new JPanel();
  JTextField input = new JTextField(20);
  JButton calculate = new JButton("계산");
  String moneyUnits[] = {
    "50000",
    "10000",
    "1000",
    "500",
    "100",
    "50",
    "10",
    "1",
  };
  int moneyEach[] = {
    Integer.parseInt(moneyUnits[0]),
    Integer.parseInt(moneyUnits[1]),
    Integer.parseInt(moneyUnits[2]),
    Integer.parseInt(moneyUnits[3]),
    Integer.parseInt(moneyUnits[4]),
    Integer.parseInt(moneyUnits[5]),
    Integer.parseInt(moneyUnits[6]),
    Integer.parseInt(moneyUnits[7]),
  };

  JLabel moneyUnit[] = new JLabel[moneyUnits.length];
  JTextField moneyResult[] = new JTextField[moneyUnits.length];

  class MyMouseListener implements MouseListener {

    public void mouseClicked(MouseEvent e) {
      int moneyTotal = Integer.parseInt(input.getText());

      for (int i = 0; i < moneyUnits.length; i++) {
        int money = Integer.parseInt(moneyUnits[i]);
        moneyEach[i] = moneyTotal / money;
        moneyTotal = moneyTotal % money;
        moneyResult[i].setHorizontalAlignment(JLabel.CENTER);
        moneyResult[i].setText(Integer.toString(moneyEach[i]));
        //moneyUnit[i].setText(Integer.toString(moneyEach[i]));
        System.out.println(moneyEach[i] + ", " + moneyTotal);
      }
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}
  }

  public Practice03() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    titlePanel.setLayout(new FlowLayout());
    titlePanel.add(new JLabel("금액"));
    titlePanel.add(input);
    titlePanel.add(calculate);
    contentPane.add(titlePanel, BorderLayout.NORTH);
    mainPanel.setLayout(new FlowLayout());

    for (int i = 0; i < moneyUnits.length; i++) {
      moneyUnit[i] = new JLabel(moneyUnits[i]);
      mainPanel.add(moneyUnit[i]);
      moneyResult[i] = new JTextField(40);
      mainPanel.add(moneyResult[i], BorderLayout.SOUTH);
      contentPane.add(mainPanel);
    }

    calculate.addMouseListener(new MyMouseListener());
    //calculate.addMouseMotionListener(new MyMouseListener());

    this.setSize(400, 500);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice03();
  }
}
