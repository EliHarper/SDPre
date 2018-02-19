public class Objective2Lab5{
  public static void main(String[] args){
    double side1, side2, asquare, bsquare, hypotenuse;
    side1 = 15.3;
    side2 = 12.42;
    asquare = side1*side1;
    bsquare = side2*side2;
    hypotenuse = Math.sqrt(asquare + bsquare);

    System.out.println("The hypotenuse of a triangle with sides " + side1 +" and " + side2 +" is "+ hypotenuse);
  }
}
