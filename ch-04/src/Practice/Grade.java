package Practice;

public class Grade {

  private int math;
  private int science;
  private int english;

  public void setGrade(int math, int science, int english) {
    this.math = math;
    this.science = science;
    this.english = english;
  }

  public int[] getGrade() {
    int[] grades = { math, science, english };
    return grades;
  }

  public Grade(int math, int science, int english) {
    this.math = math;
    this.science = science;
    this.english = english;
  }

  public int average() {
    return (math + english + science) / 3;
  }
}
