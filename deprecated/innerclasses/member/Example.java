package demo.innerclasses.member;

import demo.innerclasses.Helper;
import java.util.ArrayList;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = Helper.getExampleNumbers();
    Helper.printNumbers(numbers);

    Member member = new Member();

    Collections.sort(numbers, member.new NumberAscComparator());
    Helper.printNumbers(numbers);
  }
}
