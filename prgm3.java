
import java.util.Scanner;
public class prgm3{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    System.out.println("You entered " + number);
    System.out.println(number + " squared is " + number * number);
    System.out.println("number + cubed is " + number * number * number);
    System.out.println("Enter a double:");
    double number2 = input.nextDouble();
    System.out.println("You entered " + number2);
    System.out.println("number2 squared is " +number2 * number2);
    System.out.println("number2 cubed is " + number2 * number2 * number2);
    //closing the scanner object
    input.close();
  }
}