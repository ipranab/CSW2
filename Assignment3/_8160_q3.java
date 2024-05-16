import java.util.*;

class Car implements Comparable<Car> {
	private int modalNo;
	private String name;
	private int stock;

	public Car(int modalNo, String name, int stock) {
		this.modalNo = modalNo;
		this.name = name;
		this.stock = stock;
	}

	public int getModalNo() {
		return modalNo;
	}

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public int compareTo(Car car) {
		return Integer.compare(this.stock, car.stock);
	}
}

public class _8160_q3 {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car(2013, "SUZUKI", 20));
		cars.add(new Car(2020, "MG", 43));
		cars.add(new Car(2018, "HONDA", 10));
		cars.add(new Car(2015, "BMW", 65));
		cars.add(new Car(2017, "LAMBO", 65));
		Collections.sort(cars);
		for (Car car : cars) 
			System.out.println(car.getModalNo() + " " + car.getName() + " " + car.getStock());
	}

}
