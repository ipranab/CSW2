class Studenta implements Comparable<Studenta> {

	private int rn;
	private String name;
	private double totalMark;

	Studenta(int rn, String name, double totalMark) {
		this.rn = rn;
		this.name = name;
		this.totalMark = totalMark;
	}

	public int getRn() {
		return rn;
	}

	public String getName() {
		return name;
	}

	public double getTotalMark() {
		return totalMark;
	}

	@Override
	public int compareTo(Studenta s) {
		return Integer.compare(this.getRn(), s.getRn());
	}

	@Override
	public String toString() {
		return "Student details -> name :" + name + ", roll number : " + rn + ", total mark : " + totalMark;
	}

}

public class _8160_q5 {

	public static void main(String[] args) {
		Studenta students[] = { new Studenta(101, "SELMON", 85), new Studenta(102, "AESH", 20),
				new Studenta(100, "RANU", 70) };
		BubbleSort(students);
		for (Studenta std : students)
			System.out.println(std);
	}

	public static void BubbleSort(Studenta std[]) {
		int n = std.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (std[j].compareTo(std[j+1]) > 0) {
					Studenta temp = std[j];
					std[j] = std[j + 1];
					std[j + 1] = temp;
				}
			}
		}
	}
}
