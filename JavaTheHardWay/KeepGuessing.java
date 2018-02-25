import java.util.Scanner;

public class KeepGuessing{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    int secret, guess;

    secret = (1+(int)(Math.random()*100));

    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess it!\n");

    guess = keyboard.nextInt();

    while (guess != secret){
      System.out.println("Dear god this is going to take forever");
      System.out.println("Your guess: ");
      guess = keyboard.nextInt();
    }

    System.out.println("It's about time..");
  }
}
