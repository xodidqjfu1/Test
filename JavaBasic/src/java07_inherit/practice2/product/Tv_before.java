package java07_inherit.practice2.product;

public class Tv_before {

	private String model;
	private int price;
	
	public Tv_before(String model, int price) {
		this.model = model;
		this.price = price;
	}
	

	
	public void out() {
		System.out.println("Tv");
	}

	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
