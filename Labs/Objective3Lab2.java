import java.util.Scanner;

public class Objective3Lab2{
  public static void main(String[] args){
    String name = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("What's your name?");
    name = scanner.next();

    System.out.println("Hello, "+name);

    scanner.close();
  }
}
