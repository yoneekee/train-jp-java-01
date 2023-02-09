package Practice;

class MapDict extends Maps {

  protected String keyArray[];
  protected String valueArray[];

  //int length = 0;

  public MapDict(int length) {
    keyArray = new String[length];
    valueArray = new String[length];
    for (int i = 0; i < length; i++) {
      keyArray[i] = null;
      valueArray[i] = null;
    }
  }

  String get(String key) {
    for (int i = 0; i < keyArray.length; i++) {
      if (key.equals(keyArray[i])) {
        return valueArray[i];
      }
    }
    return null;
  }

  void put(String key, String value) {
    for (int i = 0; i < keyArray.length; i++) {
      if (keyArray[i] == null) {
        keyArray[i] = key;
        valueArray[i] = value;
        break;
      }

      if (keyArray[i].equals(key)) {
        keyArray[i] = key;
        valueArray[i] = value;
        break;
      }
    }
  }

  String delete(String key) {
    String delResult = "";

    for (int i = 0; i < keyArray.length; i++) {
      if (key.equals(keyArray[i])) {
        delResult = valueArray[i];
        keyArray[i] = null;
        valueArray[i] = null;
        break;
      }
    }

    return delResult;
  }

  int length() {
    int count = 0;
    for (int i = 0; i < valueArray.length; i++) {
      if (valueArray[i] != null) {
        count++;
      }
    }
    return count;
  }
}

public class Practice10 {

  public static void main(String[] args) {
    MapDict md = new MapDict(10);
    /*md.put("황기태", "자바");
    md.put("이재문", "파이썬");
    md.put("이재문", "C++");

    for (int i = 0; i < md.keyArray.length; i++) {
      if (md.keyArray[i] != null) {
        System.out.print(md.keyArray[i] + ":" + md.valueArray[i] + "\t");
      }
    }
    System.out.println();

    System.out.println("이재문의 값은 " + md.get("이재문"));
    System.out.println("황기태의 값은 " + md.get("황기태"));
    System.out.println("삭제한 값은 " + md.delete("황기태"));
    System.out.println("황기태의 값은 " + md.get("황기태"));

    md.put("황기태", "자바");
    md.put("이재문", "파이썬");
    md.put("이재문1", "C++");

    for (int i = 0; i < md.keyArray.length; i++) {
      if (md.keyArray[i] != null) {
        System.out.print(md.keyArray[i] + ":" + md.valueArray[i] + "\t");
      }
    }
    System.out.println();*/
    md.put("1", "one");
    md.put("2", "two");
    md.put("3", "three");
    md.put("4", "four");
    for (int i = 0; i < md.keyArray.length; i++) {
      if (md.keyArray[i] != null) {
        System.out.print(md.keyArray[i] + ":" + md.valueArray[i] + "\t");
      }
    }
    System.out.println();
    md.put("1", "일");
    md.put("2", "이");
    md.put("3", "삼");
    md.put("4", "사");
    for (int i = 0; i < md.keyArray.length; i++) {
      if (md.keyArray[i] != null) {
        System.out.print(md.keyArray[i] + ":" + md.valueArray[i] + "\t");
      }
    }
    System.out.println("\n삭제한 값 : " + md.delete("4"));

    md.put("3", "three");
    md.put("5", "five");
    md.put("6", "six");
    md.put("7", "seven");

    for (int i = 0; i < md.keyArray.length; i++) {
      if (md.keyArray[i] != null) {
        System.out.print(md.keyArray[i] + ":" + md.valueArray[i] + "\t");
      }
    }
  }
}
