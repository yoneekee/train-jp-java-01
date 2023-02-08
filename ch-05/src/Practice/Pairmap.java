package Practice;

public abstract class Pairmap {

  protected String keyArray[];
  protected String valueArray[];

  abstract String get(String key);

  abstract void put(String key, String value);

  abstract String delete(String key);

  abstract int length();
}
