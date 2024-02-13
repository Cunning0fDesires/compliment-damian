package main.java.org.example;

import java.util.List;
import java.util.Random;

public class ComplimentPicker {

  private static final Random random = new Random();
  private static final ComplimentDatabase complimentDatabase = new ComplimentDatabase();

  public static String getRandomCompliment() {
    List<String> compliments = complimentDatabase.getCompliments();
    return compliments.get(random.nextInt(compliments.size()));
  }

}
