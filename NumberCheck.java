import java.util.Scanner; 

public class NumberCheck {
    public static void main(String[] args) { 
        int userNum;

        Scanner scnr = new Scanner(System.in);
        userNum = scnr.nextInt();

        if (userNum < -15) {
            System.out.println("less than -15");
        }
        else {
            System.out.println("-15 or more");

        }
        }
    }

