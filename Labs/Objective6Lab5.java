import java.util.Scanner;

public class Objective6Lab5{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    int selection;
    selection = 0;

    while (selection != 3){
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: Exit");
      selection = keyboard.nextInt();

      if (selection==1){
        System.out.println("Hello, human. :)");
      }

      if (selection ==2){
        System.out.println("Apple, banana, and coconut.");
      }
    }
    System.out.println("Goodbye.");
    keyboard.close();
  }
}
