import java.util.Scanner;

public class Objective4Lab3{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = keyboard.nextInt();

    if (userNum > 0){
      System.out.println("You entered a positive number.");
    }

    else if (userNum < 0){
      System.out.println("You entered a negative number.");
    }

    else{
      System.out.println("You entered zero.");
    }

    keyboard.close();
  }
}
