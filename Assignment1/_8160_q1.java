package Assignment1;

class Gaadi{
	private String make, model;
	Car(String make , String model){
		this.make = make;
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}

public class _8160_q1 {
	public static void main(String[] args) {
        Gaadi myCar1 = new Gaadi("ISUZU", "MT");

        Gaadi myCar2 = new Gaadi(null, null);

        System.out.println("First values for myCar1: " + myCar1.getMake() + ", " + myCar1.getModel());
        System.out.println("First values for myCar2: " + myCar2.getMake() + ", " + myCar2.getModel());

        myCar2.setMake("CITROZEN");
        myCar2.setModel("FAKE");

        System.out.println("Reassigned values for myCar2: " + myCar2.getMake() + ", " + myCar2.getModel());
    }
}
