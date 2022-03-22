import java.util.Scanner;
public class SizeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter a value for Inch:");
double inch = input.nextDouble();
double meters = inch * 0.0254;
System.out.println(inch + "inch is " + meters + " meters");
}

}
