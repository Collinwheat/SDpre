	import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a Number");
		int userNum = input.nextInt();

		if (userNum % 2 == 0) {
			System.out.println("The Number is Even");
		}

		else {
			System.out.println("The number is Odd");
		}

		if (userNum == 0) {
			System.out.println("The number is Zero");
		}
	

		input.close();

	}
}