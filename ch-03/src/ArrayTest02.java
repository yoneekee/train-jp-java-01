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
    double sum = 0;

    score[0][0] = 2.75;
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
        sum += score[i][j];
      }
      System.out.println();
    }

    double avg = sum / (score.length * 2);
    System.out.println("평균 : " + avg);

    double score03[][] = new double[4][];
    score03[0] = new double[2];
    score03[1] = new double[3];
    score03[2] = new double[2];
    score03[3] = new double[3];
    score03[0][0] = 4.3;
    score03[0][1] = 3.3;
    score03[1][0] = 4.3;
    score03[1][1] = 3.6;
    score03[1][2] = 4.13;
    score03[2][0] = 4.23;
    score03[2][1] = 4.19;
    score03[3][0] = 4.21;
    score03[3][1] = 4.32;
    score03[3][2] = 4.5;

    double sum03 = 0;
    int count = 0;
    for (int i = 0; i < score03.length; i++) {
      for (int j = 0; j < score[i].length; i++) {
        sum03 += score03[i][j];
        count++;
      }
    }
    System.out.println("score03 평균 : " + sum03 / count);
  }
}
