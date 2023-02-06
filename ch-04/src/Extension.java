public class Extension {

  public static void main(String[] args) {
    class Animal {

      //String name;

      void love() {
        System.out.println("동물");
      }
    }

    class Human extends Animal {

      //String word;

      void child() {
        System.out.println("자식");
      }

      void love() {
        System.out.println("사람");
      }
    }

    Animal obj1 = new Human();
    Human obj2 = new Human();
    //obj1.child();
    ((Human) obj1).child();

    obj1.love();
    obj2.love();
    // obj1.name = "안녕1";
    // obj2.name = "안녕2";
    // //obj1.word = "hey1";
    // obj2.word = "hey2";

    // System.out.println(obj1.getClass() + " // " + obj1.getClass().getName());
    // System.out.println(obj2.getClass() + " // " + obj2.getClass().getName());
    // obj1.love();
    // obj2.love();
    // System.out.println(obj1.name);
    // System.out.println(obj2.word);
  }
}
