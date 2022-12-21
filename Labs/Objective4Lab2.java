import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter your first whole number");
    int num1 = keyboard.nextInt();
    System.out.println("Please enter your second whole number");
    int num2 = keyboard.nextInt();
    System.out.println("Please enter your third whole number");
    int num3 = keyboard.nextInt();

    System.out.println("Please enter your first decimal");
    double dub1 = keyboard.nextDouble();
    System.out.println("Please enter your second decimal");
    double dub2 = keyboard.nextDouble();
    System.out.println("Please enter your third decimal");
    double dub3 = keyboard.nextDouble();

    System.out.println("The sum of" +(num1) +"+"+(num2)+"+"+(num3)+"="+
      (num1+num2+num3));
    System.out.println("The sum of" +(dub1) +"+"+(num2)+"+"+(dub3)+"="+
      (dub1+dub2+dub3));
   


    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
