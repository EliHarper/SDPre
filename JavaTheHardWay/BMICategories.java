import java.util.Scanner;

public class BMICategories{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double bmi, ft, in, lbs, kg, m;

    System.out.print("Your height in ft: ");
    ft = keyboard.nextDouble();

    System.out.print("Your height in inches: ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in lbs: ");
    lbs = keyboard.nextDouble();

    kg = lbs/2.21;
    m = ((ft*12)+in)/39.37;

    bmi =  kg/(m*m);

    System.out.println("Your exact BMI is: " + bmi);
    System.out.println();

    System.out.println("BMI Category: ");
    if (bmi < 15.0){
      System.out.println("You are very severely underweight.");
    }

    else if(bmi<=16.0){
      System.out.println("You are severely underweight");
    }

    else if (bmi<18.5){
      System.out.println("You are underweight");
    }

    else if (bmi <25.0){
      System.out.println("You are normal weight");
    }

    else if (bmi < 30){
      System.out.println("You are overweight");
    }

    else if (bmi < 35){
      System.out.println("Moderately obese");
    }

    else if (bmi <40.0){
      System.out.println("Severely obese");
    }

    else {
      System.out.println("Very severely /\"morbidly\" obese");
    }
  }
}
