import java.util.Scanner;

public class CheeseCakes {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int cheesecakesQuantity;

        cheesecakesQuantity = scnr.nextInt();

        System.out.println("Initial number of cheesecakes: " + cheesecakesQuantity);

        cheesecakesQuantity = cheesecakesQuantity * 4;

        System.out.println("Updated number of cheesecakes: " + cheesecakesQuantity);

    
    }

}
