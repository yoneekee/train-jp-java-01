class Weapon {

  int fire() {
    return 1;
  }
}

class Cannon extends Weapon {

  @Override
  int fire() {
    return 10;
  }
}

public class MethodOverride02 {

  public static void main(String[] args) {
    Weapon wp = new Weapon();
    Cannon cn = new Cannon();
    System.out.println("기본 무기의 데미지 : " + wp.fire());
    System.out.println("캐논 무기의 데미지 : " + cn.fire());
  }
}
