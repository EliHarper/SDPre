import java.util.Scanner;

public class SecretWord{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess, secret2 = "nuggets";

    System.out.println("What's the secret word?");
    guess = keyboard.next();

    if (guess.equals(secret) || guess.equals(secret2) ){
      System.out.println("Thaaaat's correct!!");
    }

    else{
      System.out.println("No, it isn't \"" + guess + "\".");
    }

    if (guess == secret){
      System.out.println("This will never show.");
    }
  }
}