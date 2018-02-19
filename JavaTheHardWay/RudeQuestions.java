import java.util.Scanner;

public class RudeQuestions{
  public static void main(String[] args){
    String name, mine;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name?");
    name = keyboard.next();

    System.out.println("Hi, "+name+"! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you're "+ age+ " eh? That's not very old.");
    System.out.print("How much do you weigh, "+name+"?");
    weight = keyboard.nextDouble();

    System.out.println(weight+"!? Dear lord. Don't go admitting things like that..");

    System.out.println("Hey "+name+", can I have all of your things?");
    mine = keyboard.next();
    System.out.println(mine+"?! Oh. Well I was going to take all of your things regardless of what you said.. Awkward.");

    System.out.println("Finally, what's your income, "+name+"?");
    income = keyboard.nextDouble();

    System.out.print("Ouch. Hopefully that's "+income+" per hour, and not per year..");
    System.out.println("Smell ya later, "+name+".");

    //The program doesn't care if you enter an integer in a double's place because whole numbers can still be written as decimals.
    //The program also doesn't care if you enter a number in a string's place because it just treats it as a string, which is basically just text.
    //Simply typing enter would make the program blow up every time because there is nothing to assign to a variable.

  }
}
