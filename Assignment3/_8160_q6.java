import java.util.*;

public class _8160_q6 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		Scanner sc = new Scanner(System.in);

		treeSet.add(4);
		treeSet.add(50);
		treeSet.add(65);
		
		System.out.println("TreeSet elements: " + treeSet);

		System.out.print("Enter a number to search: ");
		int numberToSearch = sc.nextInt();
		System.out.println("Is " + numberToSearch + " present in the TreeSet? " + treeSet.contains(numberToSearch));

		System.out.print("Enter a number to remove: ");
		int numberToRemove = sc.nextInt();
		if (treeSet.remove(numberToRemove))
			System.out.println(numberToRemove + " removed successfully.");
		else
			System.out.println(numberToRemove + " not found in the TreeSet.");

		System.out.println("Updated TreeSet elements: " + treeSet);
		sc.close();
	}
}
