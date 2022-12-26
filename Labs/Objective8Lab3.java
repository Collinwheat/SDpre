public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    for (int ctrl = 1; ctrl <= 20; ctrl ++){
      counter = ctrl + 1;
      if (ctrl % 2 == 0) {
        System.out.println(ctrl + " is Even");
      }

      else {
        System.out.println(ctrl + " is Odd");
      }
      
    }
  }
}