import java.util.HashMap;

public class _8160_q10 {
    public static void main(String[] args) {
        String largeString = "KULLU JI HELLO";

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        String[] words = largeString.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            word = word.toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        int maxFrequency = 0;
        for (int frequency : wordFrequency.values()) 
            if (frequency > maxFrequency) maxFrequency = frequency;
        

        System.out.println("Most occurring word(s):");
        for (String word : wordFrequency.keySet()) 
            if (wordFrequency.get(word) == maxFrequency) 
                System.out.println(word + " - " + maxFrequency + " times");
    }
}
