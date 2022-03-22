import java.util.Scanner;
public class FahrToCels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double celsius, fahrenheit;
Scanner s = new Scanner(System.in);
System.out.println("Enter Temprature in fahrenheit:");
fahrenheit = s.nextDouble();
celsius = (fahrenheit -32)*(0.5556);
System.out.println("Temprature in Celsius:" +celsius);
	}

}
