public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, cupsOfCoffee;
    double seconds, e, checking, savings;
    String firstName, lastName, title, readiness, evilTwin;

    x = 10;
    y = 400;
    age = 39;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    cupsOfCoffee = 9000;
    savings = 0.01;
    readiness = "so ready";
    evilTwin = "Eli";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "I only have " + savings + " in my savings account :(");
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "I am " + readiness + " to start learning at SkillDistillery!");
    System.out.println("My evil twin's name is " + evilTwin + ".");
    System.out.println("If I drink " + cupsOfCoffee + " cups of coffee I might be able to defeat him.");
  }
}
