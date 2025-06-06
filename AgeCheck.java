import java.util.Scanner;

public class AgeCheck {
public static void main(String[] args) {
        int userAge;
        Scanner scnr = new Scanner(System.in);
        userAge = scnr.nextInt();
        
        if (userAge < 20) {
            System.out.println("less than 20");
        }
        else {
            System.out.println("20 or more");
        }
    }
}


