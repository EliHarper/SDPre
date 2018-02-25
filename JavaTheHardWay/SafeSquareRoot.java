import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready;

    System.out.println("ARE YOU READY?!");
    ready = keyboard.next();

    while ( ! ready.equals("YES!")){
      System.out.println("ARE. YOU. READY?!");
      ready = keyboard.next();
    }

    System.out.println("Give me a number, and I'll give you its square root.");
    System.out.println("No negatives, please.");

    x = keyboard.nextDouble();

    while (x<0){
      System.out.println("What did I just say? I won't give you the answer, but I will tell you that the answer would be as imaginary as your friends.");
      System.out.println("Try again..\n");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);
    System.out.println("The square root of "+ x +" is: "+ y);
  }
}
