package Practice;

class Dictionary extends Pairmap {

  public String get(String key) {
    for (int i = 0; i < valueArray.length; i++) {
      if (key.equals(keyArray[i])) {
        return valueArray[i];
      }
    }
    return null;
  }

  public void put(String key, String value) {
    keyArray[keyArray.length] = key;
    valueArray[valueArray.length] = value;
  }

  public String delete(String key) {
    String temp = "";
    return temp;
  }

  public int length() {
    return 1;
  }
}

public class DictionaryApp {}
