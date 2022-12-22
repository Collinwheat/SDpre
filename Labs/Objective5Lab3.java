
  import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a number: ");
      int userNum = input.nextInt();
      
      if (userNum > 0) {
        System.out.println("Number is Positive");
      }
      else if(userNum < 0) {
        System.out.println("Number is Negative");
      }

      if (userNum == 0) {
        System.out.println("Number is Zero");
      }

      input.close();
  }
}