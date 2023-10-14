
import java.util.Scanner;
public class prgm4
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
      //Getting float input
      System.out.print("Enter float: ");
    float myFloat = input.nextFloat();
    System.out.println("Float entered = " + myFloat);
    //Getting Double input
    System.out.println("Enter double: " );
    double myDouble = input.nextDouble();
    System.out.println("Double entered = " + myDouble);
    //Getting string input
    System.out.println("Enter String: ");
    String myString = input.next();
    System.out.println("String entered= " + myString);
    //Closing the Scanner object
    input.close(); 
  }
}