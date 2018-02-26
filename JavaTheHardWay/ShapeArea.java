import java.util.Scanner;

public class ShapeArea{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int choice;
    double area = 0;

    do{

      System.out.println("\nYay geometry.");
      System.out.println("-=-=-=-=-=-=-");
      System.out.println("0) Square");
      System.out.println("1) Triangle");
      System.out.println("2) Circle");
      System.out.println("3) Rectangle");
      System.out.println("4) Quit");
      choice = keyboard.nextInt();

      if (choice ==0){
        System.out.println("Side: ");
        int s = keyboard.nextInt();
        area = computeSquareArea(s);
        System.out.println("The area of your square is: "+area);
      }

      if (choice ==1){
        System.out.print("\nBase: ");
        int b = keyboard.nextInt();
        System.out.println("Height: ");
        int h = keyboard.nextInt();
        area = computeTriangleArea(b, h);
        System.out.println("The area of your triangle is: "+area);
      }

      else if (choice ==2){
        System.out.println("Radius: ");
        int r = keyboard.nextInt();
        area = computeCircleArea(r);
        System.out.println("The area of your circle is: "+area);
      }

      else if (choice ==3){
        System.out.println("Length: ");
        int l = keyboard.nextInt();
        System.out.println("Width: ");
        int w = keyboard.nextInt();
        area = computeRectangleArea(l,w);
        System.out.println("The area of your rectangle is: "+area);
      }

      else if (choice!=4){
        System.out.println("ERROR!!!!!");
      }

    }while (choice!=4);
  }

  public static double computeTriangleArea(int b, int h){
    double A;
    A = 0.5*b*h;
    return A;
  }

  public static double computeCircleArea(int r){
    double A;
    A = Math.PI*r*r;
    return A;
  }

  public static double computeRectangleArea(int l, int w){
    double A;
    A = l*w;
    return A;
  }

  public static double computeSquareArea(int s){
    double A;
    A = s*s;
    return A;
  }

}
