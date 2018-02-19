import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double ft, in, m, kg, lbs, bmi;

    System.out.print("Your height in ft: ");
    ft = keyboard.nextDouble();

    System.out.print("Your height in inches: ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in lbs: ");
    lbs = keyboard.nextDouble();

    kg = lbs/2.21;
    m = ((ft*12)+in)/39.37;

    bmi =  kg/(m*m);

    System.out.println("Your BMI is: "+ bmi);
  }
}
