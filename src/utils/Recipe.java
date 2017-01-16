package utils;

import java.util.Arrays;

public class Recipe {

	private ProductInARecipe[] products; // lista skladnikow
	private String recipe; // tekst przepisu
	private Quisine quisine; // kuchnia (wloska, chinska, itp.)
	private Device[] devicesToUse; //potrzebne urzadzenia
	private Type type; // rodzaj (zupa, pizza, itp.)
	
	public Recipe(ProductInARecipe[] products, String recipe, Quisine quisine, Device[] devicesToUse, Type type) {
		super();
		this.products = products;
		this.recipe = recipe;
		this.quisine = quisine;
		this.devicesToUse = devicesToUse;
		this.type = type;
	}

	public ProductInARecipe[] getProducts() {
		return products;
	}

	public void setProducts(ProductInARecipe[] products) {
		this.products = products;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public Quisine getQuisine() {
		return quisine;
	}

	public void setQuisine(Quisine quisine) {
		this.quisine = quisine;
	}

	public Device[] getDevicesToUse() {
		return devicesToUse;
	}

	public void setDevicesToUse(Device[] devicesToUse) {
		this.devicesToUse = devicesToUse;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(devicesToUse);
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + ((quisine == null) ? 0 : quisine.hashCode());
		result = prime * result + ((recipe == null) ? 0 : recipe.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (!Arrays.equals(devicesToUse, other.devicesToUse))
			return false;
		if (!Arrays.equals(products, other.products))
			return false;
		if (quisine != other.quisine)
			return false;
		if (recipe == null) {
			if (other.recipe != null)
				return false;
		} else if (!recipe.equals(other.recipe))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recipe [products=" + Arrays.toString(products) + ", recipe=" + recipe + ", quisine=" + quisine
				+ ", devicesToUse=" + Arrays.toString(devicesToUse) + ", type=" + type + "]";
	}
	
	
	
}
