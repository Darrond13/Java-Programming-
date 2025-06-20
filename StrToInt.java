import java.util.Scanner;

public class StrToInt {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String inn = sc.nextLine();
        int out = Integer.parseInt(inn) * 2;

        System.out.print("Output: ");
        System.out.print(out);

    }

}
