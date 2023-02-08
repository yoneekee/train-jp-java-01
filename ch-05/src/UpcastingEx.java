public class UpcastingEx {

  public static void main(String[] args) {
    Person person;
    Student student = new Student("티모시 샬라메");
    person = student; // Upcasting : 자녀 클래스의 객체가 부모의 타입을 가짐 (상향)
    person.id = "statistics";
    System.out.println(person.name);
    System.out.println(person.id);
    // System.out.println(person.grade);
    // 부모의 타입을 가진 자식 객체로는 자식에서 새로이 생성된 변수나 함수에 접근할 수 없다.

    Person person02 = new Student("니콜라스 홀트");
    // Student student02 = person02; // 에러 남
    Student student02 = (Student) person02; // 이렇게 명시적으로 캐스팅해야 함
    // Downcasting : 부모 클래스가 자녀의 타입으로 캐스팅됨
    student02.department = "Philosophy";
    System.out.println(student02.department);

    // instanceof : 전부 다 true
    System.out.println(student instanceof Student);
    System.out.println(person instanceof Person);
    System.out.println(student instanceof Person);
    System.out.println(person instanceof Student);
    System.out.println(student02 instanceof Student);
    System.out.println(person02 instanceof Person);
    System.out.println(student02 instanceof Person);
    System.out.println(person02 instanceof Student);

    System.out.println("student / " + student.getClass().getSimpleName());
    System.out.println("student02 / " + student02.getClass().getSimpleName());
    System.out.println("person / " + person.getClass().getSimpleName());
    System.out.println("person02 / " + person02.getClass().getSimpleName());
  }
}
