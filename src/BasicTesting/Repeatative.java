package BasicTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repeatative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    String[] words = input.split("\\s+");
    Map<String, Integer> wordCounts = new HashMap<>();

    for (String word : words) {
      wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
    }

    for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}


 