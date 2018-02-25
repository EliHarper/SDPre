import java.util.Scanner;

public class HighLow{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    int secret, guess;

    secret = (1+(int)(Math.random()*100));

    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess it!\n");

    guess = keyboard.nextInt();

    while (guess != secret){
      if (guess>secret){
        System.out.println("Too high!");
      }

      if (guess<secret){
        System.out.println("Too low!");
      }

      System.out.println("Try again.\n");
      guess = keyboard.nextInt();
    }

    System.out.println("It's about time..");
  }
}
