import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
  
    // - Problem 1 --
    System.out.println("Enter a positive integer: ");
    int n = s.nextInt();
    printRandom3(n);

    // -- Problem 2 --
    System.out.println("Enter the first x-coordinate: ");
    double x1 = s.nextDouble();
    System.out.println("Enter the next x-coordinate: ");
    double x2 = s.nextDouble();
    System.out.println("Enter the first y-coordinate: ");
    double y1 = s.nextDouble();
    System.out.println("Enter the next y-coordinate: ");
    double y2 = s.nextDouble();
    calcSlope(x1, x2, y1, y2);

    // -- Problem 3 --
    System.out.println("Enter two doubles: ");
    double a = s.nextDouble();
    double b = s.nextDouble();
    roundedDist(a, b);
  }


  /*************** METHODS ***************/
  // -- Problem 1 --
  public static void printRandom3(int n){
    System.out.println("Random numbers: ");
    for (int i = 0; i < 3; i++) {
      System.out.println((int) (Math.random() * (n+1)) + 2);
    }
  }

  // -- Problem 2 --
  public static void calcSlope(double x1, double x2, double y1, double y2){
    System.out.println("Slope: " + (y2 - y1)/(x2-x1));
  }

  // -- Problem 3 --
  public static void roundedDist(double a, double b){
    System.out.println("Distance: " + (int)(Math.abs(a-b)+0.5));
  }
}
