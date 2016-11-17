package models;

public class Food {
	
	private int id;
	private String description;
	private PriceType menuType;
	private double price;
	
	public Food(int id, double price, String description, PriceType menuType) {
		this.id = id;
		this.price = price;
		this.description = description;
		this.menuType = menuType;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	
	public PriceType getMenuType() {
		return menuType;
	}

	
	public double getPrice() {
		return price;
	}

	
	

}
