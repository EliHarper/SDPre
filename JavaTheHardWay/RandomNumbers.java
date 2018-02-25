public class RandomNumbers{
  public static void main(String[] args){
    int a, b, c, d, oneToThree1, oneToThree2, oneToThree3, fiveToTen1, fiveToTen2, fiveToTen3;
    double r, rps;

    rps = Math.random();
    if (rps < 0.333){
      System.out.println("ROCK");
    }

    else if (rps < 0.667){
      System.out.println("PAPER");
    }

    else{
      System.out.println("SCISSORS");
    }

    a = 1 + (int)( 10*Math.random());
    b = 1 + (int)( 10*Math.random());
    c = 1 + (int)( 10*Math.random());
    d = 1 + (int)( 10*Math.random());

    System.out.println("1-10: \t" + a + "\t"+b+"\t"+c+"\t"+d);

    a = 1 + (int)( 6*Math.random());
    b = 1 + (int)( 6*Math.random());
    c = 1 + (int)( 6*Math.random());
    d = 1 + (int)( 6*Math.random());

    System.out.println("1-6: \t" + a + "\t"+b+"\t"+c+"\t"+d);

    a = 1 + (int)( 100*Math.random());

    System.out.println("1-100: \t" + a );

    a = 1 + (int)( 100*Math.random());
    b = 1 + (int)( 100*Math.random());
    c = 1 + (int)( 100*Math.random());
    d = 1 + (int)( 100*Math.random());

    System.out.println("1-100: \t" + a + "\t"+b+"\t"+c+"\t"+d);

    a =  (int)( 100*Math.random());
    b = (int)( 100*Math.random());
    c = (int)( 100*Math.random());
    d = (int)( 100*Math.random());

    System.out.println("1-99: \t" + a + "\t"+b+"\t"+c+"\t"+d);

    a = 10 + (int)( 20*Math.random());
    b = 10 + (int)( 20*Math.random());
    c = 10 + (int)( 20*Math.random());
    d = 10 + (int)( 20*Math.random());

    System.out.println("10-20: \t" + a + "\t"+b+"\t"+c+"\t"+d);

    System.out.println("0-1: \t" + Math.random()+"\t" + Math.random());
    System.out.println("0-1: \t" + Math.random()+"\t" + Math.random());

    r = 10 * Math.random();
    System.out.println("0-9.99:\t" + r);
    System.out.println("0-9:\t"+ (int)r);
    System.out.println("1-10:\t"+(1+(int)r) );

    //print 3 random ints from 1-3

    oneToThree1 = (1+ (int)(3*Math.random()) );
    oneToThree2 = (1+ (int)(3*Math.random()) );
    oneToThree3 = (1+ (int)(3*Math.random()) );

    System.out.println("1-3:\t" + oneToThree1+ "\t" + oneToThree2 + "\t" + oneToThree3);

    //3 randInts from 5-10

    fiveToTen1 = (5 + (int) (6*Math.random()) );
    fiveToTen2 = (5 + (int) (6*Math.random()) );
    fiveToTen3 = (5 + (int) (6*Math.random()) );


    System.out.println("5-10:\t" + fiveToTen1 + "\t" + fiveToTen2 + "\t" + fiveToTen3);
  }
}
