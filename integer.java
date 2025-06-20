import java.util.Scanner;

public class integer {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal point number: ");
        double enter = sc.nextDouble();
        int out = (int) enter;
        System.out.print("Whole number: ");
        System.out.println(out);

    }

}
