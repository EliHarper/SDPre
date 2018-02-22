import java.util.Scanner;

public class ShallowGrandmother{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.println("How old are you? ");
    age = keyboard.nextInt();

    System.out.println("How much do you make in a year? ");
    income = keyboard.nextDouble();

    System.out.println("How cute are you on a scale from 0.0 to 10.0? ");
    cute = keyboard.nextDouble();

    allowed = ( age > 20 && age <30 && (income>50000|| cute >= 8.5));

    if (allowed == false){

      System.out.println("Well.. how happy do you make my grandchildren on a scale from 0.0 to 10.0?");
      happy = keyboard.nextDouble();
      allowed2 = ( happy >= 8.0 );

      System.out.println("You are allowed to date my grandchild! "+ allowed2);
    }

    else {
      System.out.println("You are allowed to date my grandchild! " + allowed);
    }
  }
}
