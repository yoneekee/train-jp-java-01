package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice01 extends JFrame {

  String[] select = { "버튼 비활성화", "버튼 감추기" };
  JButton testBtn = new JButton("TEST BUTTON");
  JCheckBox btn[] = new JCheckBox[2];

  class MyItemListener implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        if (e.getItem() == btn[0]) {
          testBtn.setEnabled(false);
          System.out.println("1");
        } else if (e.getItem() == btn[1]) {
          testBtn.setVisible(false);
        }
      } else {
        if (e.getItem() == btn[1]) {
          testBtn.setVisible(true);
        } else if (e.getItem() == btn[0]) {
          testBtn.setEnabled(true);
        }
      }
    }
  }

  public Practice01() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    for (int i = 0; i < select.length; i++) {
      btn[i] = new JCheckBox(select[i]);
      contentPane.add(btn[i]);
      btn[i].addItemListener(new MyItemListener());
    }

    testBtn.addItemListener(new MyItemListener());
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(btn[0], BorderLayout.WEST);
    panel.add(btn[1], BorderLayout.EAST);
    testBtn.setSize(200, 100);
    panel.add(testBtn, BorderLayout.SOUTH);

    contentPane.add(panel);

    this.setSize(300, 500);

    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
