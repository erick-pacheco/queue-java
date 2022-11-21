import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    ArrayDeque<String> myQueue = new ArrayDeque<>();

    /* Step 2: refactored */
    int[] queItems = { 1, 2, 3, 4, 5 };

    /* Step 3 */
    for (int item : queItems) {
      queue.offer(item);
    }

    log(queue.peek());

    /* Step 4 */
    String[] myObjs = { "Zero", "One", "Two", "Three", "Four", "Five" };

    for (String item : myObjs) {
      myQueue.offer(item);
    }

    /* Step 6 */
    for (String item : myQueue) {
      log(item);
    }

  }

  public static void log(Object message) {
    System.out.println(message);
  }
}
