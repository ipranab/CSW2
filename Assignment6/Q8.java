import java.util.Scanner;
public class ConcatAndRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String firstStr = sc.nextLine();
		
		System.out.print("Enter the second string: ");
		String secondStr = sc.nextLine();
		
		String concatenatedStrMethod = firstStr.concat(secondStr);
		String concatenatedStrPlus = firstStr + secondStr;
		
		System.out.println("Concatenated using method: " + concatenatedStrMethod);
		System.out.println("Concatenated using + operator: " + concatenatedStrPlus);
		
		System.out.print("Enter an index to retrieve character from concatenated string:");
		int index = sc.nextInt();
		
		if (index >= 0 && index < concatenatedStrPlus.length()) {
			System.out.println("Character at index " + index + ": " +concatenatedStrPlus.charAt(index));
		}else {
			System.out.println("Index out of range.");
		}
		
		sc.close();

	}

}
