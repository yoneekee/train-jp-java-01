public class ArrayTest02 {

  public static void main(String[] args) {
    int intArray[][] = new int[3][5];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        intArray[i][j] = j + 1;
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(intArray[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();

    int intArray2[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 }, { 4, 5, 6 } };

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(intArray2[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();

    double score[][] = new double[4][2];
    score[0][0] = 2.5;
    score[0][1] = 3.5;
    score[1][0] = 3.8;
    score[1][1] = 3.86;
    score[2][0] = 3.16;
    score[2][1] = 4.17;
    score[3][0] = 4.27;
    score[3][1] = 4.37;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(score[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
  }
}
