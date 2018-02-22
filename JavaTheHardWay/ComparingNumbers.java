import java.util.Scanner;

public class ComparingNumbers{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.println("Give me two numbers. First number: ");
    first = keyboard.nextDouble();

    System.out.println("Second number: ");
    second = keyboard.nextDouble();

    if (first < second)
      System.out.println(first + "is LESS THAN "+second);


    if (first > second)
      System.out.println(first + "is GREATER THAN "+second);


    if (first <= second)
      System.out.println(first + " is LESS THAN or EQUAL TO "+second);


    if (first >= second)
      System.out.println(first + " is GREATER THAN or EQUAL TO "+ second);


    if (first == second)
      System.out.println(first + " is EQUAL TO "+second);


    if (first != second){
      System.out.println(first + " is NOT EQUAL TO "+ second);
      System.out.println("Hey.");
    }
  }
}
