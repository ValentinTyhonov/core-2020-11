package homework.rnebelsky;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
      String pass;
      Scanner newScan = new Scanner(System.in);
      pass= newScan.nextLine();

      switch (pass){
          case "pass123" -> System.out.println("You are authorized.");
          case "admin" -> System.out.println("You are authorized as admin.");
          default -> System.out.println("Wrong password.");
        }
    }
}