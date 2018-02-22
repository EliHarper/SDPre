import java.util.Scanner;

public class WeaselOrNot{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    String word;
    boolean yep, nope;

    System.out.println("Type the word \"Weasel\", please.");
    word = keyboard.next();

    yep = "Weasel".equals (word);
    nope = ! word.equals("Weasel");

    System.out.println("You can follow simple instructions: " + yep);
    System.out.println("You can't type a 6 letter word correctly: " +nope);
  }
}
