import java.util.*;

class Car implements Comparable<Car> {
	private String model, color;
	private int speed;

	Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public int compareTo(Car c) {
		return Integer.compare(this.getSpeed(), c.getSpeed());
	}

	public String toString() {
		return "Car model : " + model + ", color : " + color + ", speed : " + speed;
	}
}

public class _8160_q3 {

	public static void main(String[] args) {
		Car cars[] = { new Car("LAMBOR", "Gasoline", 300), new Car("OMNI", "White", 500) };
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		Arrays.sort(cars);
		System.out.println("The car has greatest speed -> " + cars[1]);
	}

}
