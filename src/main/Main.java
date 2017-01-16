package main;

import utils.ProductInAFridge;
import utils.ProductInARecipe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductInAFridge product1 = new ProductInAFridge("ziemniaki", "wegetarianski", 5, "szt.");
		System.out.println(product1.toString());
		
		ProductInARecipe product2 = new ProductInARecipe("ziemniaki", "wegetarianski", 5, "szt.");
		System.out.println(product2.toString() + "utworzenie nowego ");
		
	}

}
