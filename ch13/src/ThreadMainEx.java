class ThreadMain {}

public class ThreadMainEx {

  public static void main(String[] args) {
    System.out.println(
      "Thread.currentThread().getId() : " +
      Thread.currentThread().getId() +
      "\nThread.currentThread().getName() : " +
      Thread.currentThread().getName() +
      "\nThread.currentThread().getState() : " +
      Thread.currentThread().getState() +
      "\nThread.currentThread().getPriority() : " +
      Thread.currentThread().getPriority()
    );
  }
}
