package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

class WordList {

  Vector<String> wordlst = new Vector<String>();
  File file;
  Scanner scanner = new Scanner(System.in);

  public void wordSearch(String fileName) {
    try {
      file = new File(fileName);
      Scanner readWord = new Scanner(new FileReader(file));
      while (readWord.hasNext()) {
        String line = readWord.nextLine();
        wordlst.add(line);
      }
      System.out.println(
        "프로젝트 폴더 밑의 " + file.getName() + " 파일을 읽었습니다...."
      );
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    int cnt = 0;
    while (true) {
      System.out.print("단어>> ");
      String Input = scanner.nextLine();
      if (Input.equals("그만")) {
        System.out.println("종료합니다....");

        break;
      }
      for (int i = 0; i < wordlst.size(); i++) {
        if (wordlst.get(i).startsWith(Input)) {
          System.out.println(wordlst.get(i));
          cnt += 1;
        }
      }
      if (cnt == 0) {
        System.out.println("발견할 수 없음");
      }
    }
  }
}

public class Practice11 {

  public static void main(String[] args) {
    WordList wl = new WordList();
    wl.wordSearch("c:\\Temp\\words.txt");
  }
}
