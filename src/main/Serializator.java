package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import utils.ProductInAFridge;
import utils.ProductInARecipe;
import utils.Recipe;

public class Serializator {

	public static void serializeProductInAFridge(ProductInAFridge product) throws IOException {
		FileOutputStream fs = new FileOutputStream("testSerProductInAFridge.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(product);
		os.close();
	}

	public static void deserializeProductInAFridcg() throws Exception {
		FileInputStream fis = new FileInputStream("testSerProductInAFridge.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ProductInAFridge product = (ProductInAFridge) ois.readObject();
		System.out.println("Pordukt po decerializacji" + product);
		ois.close();
	}

	public static void serializeProductInARecipe(ProductInARecipe product) throws IOException {
		FileOutputStream fs = new FileOutputStream("testSerProductInARecipe.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(product);
		os.close();
	}

	public static void deserializeProductInARecipe() throws Exception {
		FileInputStream fis = new FileInputStream("testSerProductInARecipe.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ProductInAFridge product = (ProductInAFridge) ois.readObject();
		System.out.println("Pordukt po decerializacji" + product);
		ois.close();
	}
	
	public static void serializeRecipe(Recipe recipe) throws IOException {
		FileOutputStream fs = new FileOutputStream("testSerRecipe.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(recipe);
		os.close();
	}

	public static void deserializeRecipe() throws Exception {
		FileInputStream fis = new FileInputStream("testSerRecipe.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Recipe recipe = (Recipe) ois.readObject();
		System.out.println("Pordukt po decerializacji" + recipe);
		ois.close();
	}
}
