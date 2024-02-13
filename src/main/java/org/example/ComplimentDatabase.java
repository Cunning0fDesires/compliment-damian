package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class ComplimentDatabase {

  private final List<String> compliments;

  public ComplimentDatabase() {
    compliments = new ArrayList<>();
    compliments.add(Compliments.c1);
    compliments.add(Compliments.c2);
  }

  public List<String> getCompliments() {
    return compliments;
  }
}
