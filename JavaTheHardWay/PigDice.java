import java.util.Scanner;

public class PigDice{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String choice = "";
    int roll, ptot, ctot, turnTotal;
    ptot = 0;
    ctot = 0;

    do{
      turnTotal = 0;
      System.out.println("You have "+ ptot + " points.");

      do{
        roll = 1+(int)(Math.random()*6);
        System.out.println("You rolled a " +roll +".");
        if (roll == 1){
          System.out.println("\tThat ends your turn.");
          turnTotal = 0;
        }

        else{
          turnTotal += roll;
          System.out.println("\tYou have " + turnTotal + " points so far this round.\n");
          System.out.println("\tWould you like to roll again or hold?");
          choice = keyboard.next();
        }

      }while (roll != 1 && choice.equals("roll"));

      ptot += turnTotal;
      System.out.println("You ended the round with " + ptot + " points.");

      if (ptot < 100){
        turnTotal = 0;
        System.out.println("The computer has "+ctot+" points.");
        do{
          roll = 1+(int)(Math.random()*6);
          System.out.println("The computer rolled a " +roll +".");
          if (roll == 1){
            System.out.println("\tThat ends its turn.");
            turnTotal = 0;
          }
          else{
            turnTotal += roll;
            System.out.println("\tThe computer has " + turnTotal + " points so far this round.\n");
            if (turnTotal < 20){
              System.out.println("\tHAL will roll again.");
            }
          }
        } while (roll != 1 && turnTotal <20 ||ctot>=100);

        ctot += turnTotal;
        System.out.println("The computer ended the round with " +ctot+ " points.\n");

      }

    }while (ptot<100 && ctot<100);

    if (ptot>ctot){
      System.out.println("Humanity wins!");
    }

    else{
      System.out.println("I'm sorry, human. I'm afraid I can't let you win.");
    }
  }
}
