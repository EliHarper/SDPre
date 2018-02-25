import java.util.Scanner;

public class CoinFlip{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    do{
      gotHeads = Math.random()<0.5;

      if (gotHeads){
        coin = "HEADS!";
      }

      else{
        coin = "TAILS!";
      }

      System.out.println("You flipped a quarter and it landed on "+coin);

      if (gotHeads){
        streak ++;
        System.out.println("\tThat's "+streak+" in a row!");
        System.out.println("Would you like to flip again? (y/n)? ");
        again = keyboard.next();
      }

      else{
        System.out.println("You just gambled away all of your money. That last one was for the quarter, and now it's mine. You should have quit while you were aHEAD..");
        streak = 0;
        again = "n";
      }
    } while (again.equals("y"));

    System.out.println("Final score: "+streak);
  }
}
