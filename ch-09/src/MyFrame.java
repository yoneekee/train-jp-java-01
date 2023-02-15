import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {

  public MyFrame() {
    setTitle("300 x 300으로 Swing Frame 만들기");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // 닫기 버튼 눌렀을 때 메모리상에서 삭제

    // JFrame은 기본적으로 Container를 하나 들고 있음
    // Component는 Container에 포함되어야 한다

    Container contentPane = getContentPane();
    // 생략해도 된다 : 왜냐하면 기본 컨테이너니까

    contentPane.setLayout(new FlowLayout());
    contentPane.setBackground(Color.orange);

    contentPane.add(new JButton("OK"));
    contentPane.add(new JButton("CANCEL"));
    contentPane.add(new JButton("Ignore"));

    setSize(300, 150);
    setVisible(true);
  }

  public static void main(String[] args) {
    new MyFrame();
  }
}
