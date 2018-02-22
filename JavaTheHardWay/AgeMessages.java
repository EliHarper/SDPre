import java.util.Scanner;

public class AgeMessages{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.println("How old are you? ");
    age = keyboard.nextInt();

    if (age < 13){
      System.out.println("\tToo young to create a Facebook account");
    }

    if (age >= 13){
      System.out.println("\tYou're old enough to create a Facebook account");
    }

    if (age <16){
      System.out.println("\tToo young to have a driver's licesne");
    }

    if (age >=16){
      System.out.println("\tYou're old enough to have a driver's licesne");
    }

    if (age <18){
      System.out.println("\tToo young to vote");
    }

    if (age >= 18){
      System.out.println("\tYou're old enough to vote");
    }

    if (age < 21){
      System.out.println("\tToo young to drink");
    }

    if (age >= 21){
      System.out.println("\tLet's go grab a drink");
    }

    if (age < 35){
      System.out.println("\tToo young to be POTUS");
    }

    if (age >= 35){
      System.out.println("\tYou're old enough to be POTUS");
    }

    if (age > 65){
      System.out.println("\tYou should retire.");
    }

    if (age <= 65){
      System.out.println("\tYou should not retire yet.");
    }

    System.out.println("\t\tSAD!");
  }
}
