import java.util.Scanner;

public class Objective3Lab4{
  public static void main(String[] args){
    String firstName, lastName;
    int age;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello, human! What is your first name?");
    firstName = scanner.next();

    System.out.println("What is your last name?");
    lastName = scanner.next();

    System.out.println("How old are you?");
    age = scanner.nextInt();

    System.out.println("First name: " + firstName + ", Last name: " +lastName+ ", Age: "+age);
    scanner.close();
  }
}
