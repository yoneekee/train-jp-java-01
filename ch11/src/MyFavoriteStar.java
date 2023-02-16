import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFavoriteStar extends JFrame {

  private int current = 2;

  String starList[] = {
    "star00.jpg",
    "star01.jpg",
    "star02.jpg",
    "star03.jpg",
    "star04.jpg",
    "star05.jpg",
    "star06.jpg",
    "star07.jpg",
    "star08.jpg",
    "star09.jpg",
  };

  String starNameList[] = {
    "에스파 카리나",
    "뉴진스 해린",
    "뉴진스 민지",
    "뉴진스 혜인",
    "뉴진스 다니엘",
    "뉴진스 하니",
    "아이브 안유진",
    "아이브 레이",
    "르세라핌 카즈하",
    "르세라핌 김채원",
  };

  public MyFavoriteStar() {
    this.setTitle("My Favorite Star");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();

    contentPane.setLayout(new BorderLayout(10, 10)); // 동서남북 // BorderLayout이 디폴트임
    JLabel title = new JLabel("My Favorite Star 를 선택해주세요");
    title.setFont(new Font("나눔스퀘어", Font.BOLD, 24));
    title.setHorizontalAlignment(JLabel.CENTER);
    contentPane.add(title, BorderLayout.NORTH);

    JPanel mainPanel = new JPanel();
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    leftPanel.setLayout(new BorderLayout(10, 10));
    rightPanel.setLayout(new BorderLayout(10, 10));

    JLabel leftLabel = new JLabel(new ImageIcon("ch11/images/star/star00.jpg"));
    JLabel rightLabel = new JLabel(
      new ImageIcon("ch11/images/star/star01.jpg")
    );
    JLabel leftDetail = new JLabel(starNameList[0]);
    JLabel rightDetail = new JLabel(starNameList[1]);
    JLabel VS = new JLabel("VS");

    VS.setHorizontalAlignment(JLabel.CENTER);
    leftDetail.setHorizontalAlignment(JLabel.CENTER);
    rightDetail.setHorizontalAlignment(JLabel.CENTER);

    leftPanel.add(leftLabel, BorderLayout.NORTH);
    leftPanel.add(leftDetail, BorderLayout.SOUTH);

    rightPanel.add(rightLabel, BorderLayout.NORTH);
    rightPanel.add(rightDetail, BorderLayout.SOUTH);

    mainPanel.add(leftPanel, BorderLayout.WEST);
    mainPanel.add(rightPanel, BorderLayout.EAST);
    mainPanel.add(VS, BorderLayout.CENTER);

    contentPane.add(mainPanel);

    // prettier-ignore
    leftLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          if(current == starList.length) {
            title.setText("My Favorite Star is " + leftDetail.getText());
            rightLabel.setVisible(false);
            rightDetail.setVisible(false);
            VS.setVisible(false);
            mainPanel.add(leftPanel, BorderLayout.CENTER);
           
          } else {
          rightLabel.setIcon(new ImageIcon("ch11/images/star/" + starList[current]));
          rightDetail.setText(starNameList[current]);
          current++;
         
          }
          
        }
      }
      
    );
    rightLabel.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          if (current == starList.length) {
            title.setText("My Favorite Star is " + rightDetail.getText());
            leftLabel.setVisible(false);
            leftDetail.setVisible(false);
            VS.setVisible(false);
            mainPanel.add(rightPanel, BorderLayout.CENTER);
            System.out.println(current);
          } else {
            leftLabel.setIcon(
              new ImageIcon("ch11/images/star/" + starList[current])
            );
            leftDetail.setText(starNameList[current]);
            current++;
          }
        }
      }
    );
    //rightLabel.setSize(10, 210);
    //mainPanel.setLayout(new FlowLayout());

    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new MyFavoriteStar();
  }
}
