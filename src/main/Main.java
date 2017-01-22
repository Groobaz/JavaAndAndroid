package main;

import visualisation.MainPage;

public class Main {

	public static void main(String[] args) {
		
		//W³¹czam G³ówn¹ Stronê w nowym w¹tku, tak aby aplikacja mog³a siê wykonywaæ w tle
		new Thread(){
			@Override
			public void run(){
				javafx.application.Application.launch(MainPage.class);
			}
		}.start();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		/*****************************************************************/
		/********************** Kopia Serializacji klas ******************/
		/*****************************************************************/
		/*ProductInAFridge product1 = new ProductInAFridge("ziemniaki", "wegetarianski", 5, "szt.");
		System.out.println(product1.toString());
		ProductInARecipe product2 = new ProductInARecipe("ziemniaki", "wegetarianski", 5, "szt.");
		System.out.println(product2.toString() + "utworzenie  go produktu1");
		System.out.println("Nowy komentarz");
		
		try {
			Serializator.serializeProductInAFridge(product1);
			Serializator.deserializeProductInAFridcg();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}
	

}
