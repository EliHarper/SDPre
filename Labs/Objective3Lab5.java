import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args){
    double num1, num2, sum;
    Scanner scanner = new Scanner (System.in);

    System.out.println("Please enter a number:");
    num1 = scanner.nextInt();

    System.out.println("Please enter another number:");
    num2 = scanner.nextInt();

    sum = num1 + num2;

    System.out.println("The sum of "+num1+" and "+num2+" is " +sum+".");
    scanner.close();
  }
}
