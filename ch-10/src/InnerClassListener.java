//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyActionListener2 implements ActionListener {

  public void actionPerformed(ActionEvent e) {
    JButton btn = (JButton) e.getSource();

    if (btn.getText().equals("Action")) {
      btn.setText("액션");
    } else {
      btn.setText("Action");
    }
  }
}

public class InnerClassListener {}
