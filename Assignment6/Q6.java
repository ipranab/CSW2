import java.util.Scanner;
public class CompareCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();
		
		String str1Lower = str1.toLowerCase();
		String str2Lower = str2.toLowerCase();
		System.out.println("Lowercase versions: " + str1Lower + ", " + str2Lower);
		System.out.println("Uppercase versions: " + str1.toUpperCase() + ", " + str2.toUpperCase());
		boolean areEqualIgnoringCase = str1Lower.equals(str2Lower);
		System.out.println("Are the two strings equal (case insensitive)? " +areEqualIgnoringCase);
		
		sc.close();
		
	}

}
