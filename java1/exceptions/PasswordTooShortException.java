package java1.exceptions;

public class PasswordTooShortException extends Exception {
  public final int tooShortBy;

  public PasswordTooShortException(int tooShortBy) {
    super("Password too short!");
    this.tooShortBy = tooShortBy;
  }
}
