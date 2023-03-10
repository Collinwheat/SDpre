import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

   System.out.println("Please provide a number");
   num1 = kb.nextDouble();
   System.out.println("Please provide another number");
   num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
     case 1:
      findSum(num1, num2);
      break;

     case 2:
     	findAverage(num1, num2);
     	break;

     case 3:
     	calcTax(num1, num2);
     	break;

     case 4:
     	System.out.println("Goodbye!");

		}
		kb.close();

	}
}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("The sum of" + num1 + " and" + num2 + " is" + sum);
	  return sum;}
	public static double findAverage(double num1, double num2){
		double average = ((num1 + num2)/2);
		System.out.println("The average of " + num1 + " and" + num2 + " is" + average);
	  return average;}
	public static double calcTax(double num1, double num2){
		double tax = ((num1 + num2)*.0831);
		System.out.println(" The amount in tax to be collected is " + tax);
	  return tax;}

}