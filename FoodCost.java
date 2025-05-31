import java.util.Scanner;

public class FoodCost {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int burritoCost = 7;
		int enchiladaCost = 10;
		int pizzaCost = 9;
		int numBurritos;
		int numEnchiladas;
		int numPizzas;
		int combinedCost;

		numBurritos = scnr.nextInt();
		numEnchiladas = scnr.nextInt();
		numPizzas = scnr.nextInt();

      numBurritos = burritoCost * numBurritos;
      numEnchiladas = enchiladaCost * numEnchiladas;
      numPizzas = pizzaCost * numPizzas;
      combinedCost = numPizzas + numEnchiladas + numBurritos;

      System.out.println("Cost: " + combinedCost);
   }
}
    
