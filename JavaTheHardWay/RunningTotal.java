import java.util.Scanner;

public class RunningTotal{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int current, total =0;

    System.out.println("Type a bunch of numbers and I'll add them up.");
    System.out.println("I'll stop when you type a zero.");
    current = keyboard.nextInt();
    total = current;

    //while (current != 0){
    do{
      System.out.println("Your current total is: "+total);
      System.out.println("Value: ");
      current = keyboard.nextInt();
      total += current;
      //moved current = keyboard.nextInt();  down here
    } while (current !=0);

    System.out.println("The final total is: "+total);

  }
}
