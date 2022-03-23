/*Write a java program to calculate average of four number*/
import java.util.Scanner;
public class AverageOfFour {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scan.nextDouble();
        System.out.print("Enter the fourth number: ");
        double num4 = scan.nextDouble();
        scan.close();
        System.out.print("The average of entered numbers is:" + avr(num1, num2, num3, num4) );
    }

  public static double avr(double a, double b, double c, double d)
    {
        return (a + b + c + d) / 4;
    }
}

