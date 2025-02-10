package java2.records;

public record Dog(String name, int age, int height) {
  public boolean isBig() {
    return height > 30;
  }
}
