import java.util.Scanner;
public class ReplaceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		System.out.print("Enter the word to replace: ");
		String wordToReplace = sc.next();
		
		System.out.print("Enter the replacement word: ");
		String replacementWord = sc.next();
		
		int wordIndex = sentence.indexOf(wordToReplace);
		if (wordIndex != -1) {
			String newSentence = sentence.substring(0, wordIndex) + replacementWord + sentence.substring(wordIndex + wordToReplace.length());
			System.out.println("Original sentence: " + sentence);
			System.out.println("Modified sentence: " + newSentence);
		}else {
			System.out.println("Word not found in the sentence.");
		}
		
		sc.close();

	}

}
