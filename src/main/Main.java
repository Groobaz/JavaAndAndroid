package main;

import java.io.IOException;

import utils.ProductInAFridge;
import utils.ProductInARecipe;

public class Main {

	public static void main(String[] args) {
		
		ProductInAFridge product1 = new ProductInAFridge("ziemniaki", "wegetarianski", 5, "szt.");
		System.out.println(product1.toString());
		
		ProductInARecipe product2 = new ProductInARecipe("ziemniaki", "wegetarianski", 5, "szt.");

		System.out.println(product2.toString() + "utworzenie  go produktu1");
		
		System.out.println("Nowy komentarz");
		try {
			Serializator.serializeProductInAFridge(product1);
			Serializator.deserializeProductInAFridcg();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
