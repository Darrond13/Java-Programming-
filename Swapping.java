import java.util.Scanner; 

public class Swapping {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
        
    }
}
