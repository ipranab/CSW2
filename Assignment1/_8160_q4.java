class Laptop {
	private String model;
	private double price;
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Laptop Model: " + model + ", Price: $" + price;
	}
}

public class _8160_q4 {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();

        lappy.setModel("Lenovo Legion X");
        lappy.setPrice(59909.00);

        System.out.println(mylapptoppp);
	}

}
