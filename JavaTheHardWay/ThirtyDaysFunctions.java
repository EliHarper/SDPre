import java.util.Scanner;

public class ThirtyDaysFunctions{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Which month? (1-12): ");
    int month = keyboard.nextInt();

    System.out.println(monthDays(month) + " days hath "+ monthName(month));
  }
  public static String monthName(int month){

    String monthName = "error";

    switch (month){
      case 1: monthName = "January";
        System.out.println("monthName is now set to January.");

      case 2: monthName = "February";
        System.out.println("monthName is now set to February.");

      case 3: monthName = "March";
        break;

      case 4: monthName = "April";
        break;

      case 5: monthName = "May";
        break;

      case 6: monthName = "June";
        break;

      case 7: monthName = "July";
        break;

      case 8: monthName = "August";
        break;

      case 9: monthName = "September";
        break;

      case 10: monthName = "October";
        break;

      case 11: monthName = "November";
        break;

      case 12: monthName = "December";
        break;

    }return monthName;
  }

  public static int monthDays(int month){

    int days;

    switch (month){
      case 9:

      case 4:

      case 6:

      case 11: days = 30;
        break;

      case 2: days = 28;
        break;

      default: days = 31;
    }
    return days;
  }
}