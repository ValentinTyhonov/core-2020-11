package homework.rnebelsky;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int number = newScan.nextInt();
        if(0==number%2){
            System.out.println("Entered number is odd");
        }
        else{
            System.out.println("Entered number is even");
        }

    }
}
