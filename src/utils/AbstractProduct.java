package utils;

import java.io.Serializable;

public abstract class AbstractProduct implements Serializable {
	
	
	private static final long serialVersionUID = 943214703072572058L;
	private String name;
	private String type; //liquid, wagetable, meat
	private Integer quantity; // 0.5 ect
	private String quantityType; // ml, litry, gramy, kg ect. //warto to w przysz³oœci zamienic na enuma
	
	@Override
	public String toString() {
		return "AbstractProduct [name=" + name + ", type=" + type + ", quantity=" + quantity + ", quantityType="
				+ quantityType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((quantityType == null) ? 0 : quantityType.hashCode());
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
		AbstractProduct other = (AbstractProduct) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (quantityType == null) {
			if (other.quantityType != null)
				return false;
		} else if (!quantityType.equals(other.quantityType))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	/********************************************************************************************/	
	/******************************Gettery i Settery*********************************************/	
	/********************************************************************************************/	
	public AbstractProduct(String name, String type, Integer quantity, String quantityType) {
		super();
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.quantityType = quantityType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getQuantityType() {
		return quantityType;
	}
	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}
	
}
