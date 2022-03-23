import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for (int i = 1; i <= 12; i++) {
          
            System.out.println(N + " * " + i + " = "
             + N * i);
	}
		}
	}


