package Practice;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

  private String stuName;
  private String stuDepart;
  private String stuNum;
  private double stuGrade;

  public String getStuName() {
    return this.stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public String getStuDepart() {
    return this.stuDepart;
  }

  public void setStuDepart(String stuDepart) {
    this.stuDepart = stuDepart;
  }

  public String getStuNum() {
    return this.stuNum;
  }

  public void setStuNum(String stuNum) {
    this.stuNum = stuNum;
  }

  public double getStuGrade() {
    return this.stuGrade;
  }

  public void setStuGrade(double stuGrade) {
    this.stuGrade = stuGrade;
  }
}

public class Practice05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    while (true) {
      Student stu = new Student();
      System.out.print(
        "학생 이름, 학과, 학번, 학점평균 입력 (학생 이름에 '그만' 적으면 종료) >>>> "
      );
      String stuInfo = sc.nextLine();
      String[] stuInfos = stuInfo.split(", ");
      if (stuInfos[0].equals("그만")) break;
      stu.setStuName(stuInfos[0]);
      stu.setStuDepart(stuInfos[1]);
      stu.setStuNum(stuInfos[2]);
      String stuNumStr = stuInfos[3];
      double stuNum = Double.parseDouble(stuNumStr);
      stu.setStuGrade(stuNum);

      students.add(stu);
    }

    System.out.println("----------------------------------------");
    for (int i = 0; i < students.size(); i++) {
      System.out.println("이름 : " + students.get(i).getStuName());
      System.out.println("학과 : " + students.get(i).getStuDepart());
      System.out.println("학번 : " + students.get(i).getStuNum());
      System.out.println("학점평균 : " + students.get(i).getStuGrade());
      System.out.println("----------------------------------------");
    }

    sc.close();
  }
}
