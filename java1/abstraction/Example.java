package java1.abstraction;

import java.util.ArrayList;

public class Example {
  public static void main(String[] args) {
    // Animal animal = new Animal();
    // new Animal ist nicht möglich, da Animal eine abstrakte Klasse ist

    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Cat());
    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Dog());
    for (Animal animal : animals) {
      animal.makeSound();
    }
  }
}
