package java2.functionalprogramming;

import java.util.Comparator;

public class AgeComparator implements Comparator<Human> {
  public int compare(Human h1, Human h2) {
    if (h1.age() < h2.age()) {
      return -1;
    } else if (h1.age() > h2.age()) {
      return 1;
    } else {
      return 0;
    }
  }
}
