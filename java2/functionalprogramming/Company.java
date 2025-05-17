package java2.functionalprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
  public final List<Human> employees;

  public Company() {
    this.employees = new ArrayList<>(List.of(new Human(80), new Human(10), new Human(65)));
  }

  public void sortByAgeDescending() {
    // Klasse
    Collections.sort(employees, new AgeComparator());

    // Anonyme Klasse
    Collections.sort(
        employees,
        new Comparator<Human>() {
          public int compare(Human h1, Human h2) {
            if (h1.age() < h2.age()) {
              return -1;
            } else if (h1.age() > h2.age()) {
              return 1;
            } else {
              return 0;
            }
          }
        });

    // // Lambda Funktion - Lange Syntax
    Collections.sort(
        employees,
        (Human h1, Human h2) -> {
          if (h1.age() < h2.age()) {
            return -1;
          } else if (h1.age() > h2.age()) {
            return 1;
          } else {
            return 0;
          }
        });
    // // Lambda Funktion - Kurze Syntax
    Collections.sort(
        employees, (Human h1, Human h2) -> h1.age() < h2.age() ? -1 : h1.age() > h2.age() ? 1 : 0);

    // // Lambda Funktion - Kurze Syntax ohne explizite Datentypen
    Collections.sort(employees, (h1, h2) -> h1.age() < h2.age() ? -1 : h1.age() > h2.age() ? 1 : 0);

    // // Lambda Funktion - Als Referenzvariable gespeichert
    Comparator<Human> ageSorter =
        (h1, h2) -> h1.age() < h2.age() ? -1 : h1.age() > h2.age() ? 1 : 0;
    Collections.sort(employees, ageSorter);
  }
}
