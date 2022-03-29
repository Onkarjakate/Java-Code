import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int a = sc.nextInt();
		
		try {
			System.out.println(a/0);
			}
		catch(ArithmeticException e)
			{
			System.out.println(e.toString());	
			}
		
		System.out.print("enter the next value");
		String s1= sc.next();
		int num1= Integer.parseInt(s1);

	}

}
