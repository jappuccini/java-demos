package java1.exceptions;

public class PasswordTooLongException extends Exception {
  public final int tooLongBy;

  PasswordTooLongException(int tooLongBy) {
    this.tooLongBy = tooLongBy;
  }
}
