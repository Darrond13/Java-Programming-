import java.util.Scanner;

public class PlusSignSeparatedValues {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inCount;
      int inputVal;
      int i;

      inCount = scnr.nextInt();

      for (i = 0; i < inCount; ++i) {
         inputVal = scnr.nextInt();
         System.out.print(inputVal);
         if(i != inCount -1){
         System.out.print("+");
         }
      }
      System.out.println();
   }
}


