import java.util.Scanner;

public class EnterPin{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, pwEntry;

    pin = 12345;
    password = "Snoo";

    System.out.println("Please enter your password:");
    pwEntry = keyboard.next();

    while ( ! pwEntry.equals(password)){
      System.out.println("\nIncorrect password. Try again.");
      System.out.println("\nPlease enter your password:");
      pwEntry = keyboard.next();
    }

    System.out.println("\nPassword accepted. Welcome to Java Debt Collectors.");
    System.out.println("Please enter your PIN:");
    entry = keyboard.nextInt();

    while (entry != pin){
      System.out.println("\nIncorrect PIN. Try again.");
      System.out.println("\nPlease enter your PIN:");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN accepted. Your balance is -$1,000,000");
  }
}
