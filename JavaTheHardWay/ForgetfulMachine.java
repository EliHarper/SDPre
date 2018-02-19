import java.util.Scanner;

public class ForgetfulMachine{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);

    System.out.println("What is the capital of France?");
    keyboard.next();

    System.out.println("What is 2+2?");
    keyboard.nextInt();

    System.out.println("Pick a number between 1 and 10, but don't pick the wrong one..");
    keyboard.nextDouble();

    System.out.println("Any last words?");
    keyboard.next();

    //The second question blows up when I type four
    //The third question blows up when I type anything that doesn't qualify as a Double
  }
}
