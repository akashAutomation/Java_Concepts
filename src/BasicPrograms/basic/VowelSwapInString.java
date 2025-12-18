package BasicPrograms.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VowelSwapInString {

    public static void main(String[] args) {
        // "Hello Everyone" to swap the vowels in the string and print "Holle evoryenE"

        String input = "Hello Everyone";
        String output = swapVowels(input);
        System.out.println(output); // 👉 Holle evoryenE
    }

    public static String swapVowels(String str) {
        String vowelsSet = "aeiouAEIOU";
        StringBuilder result = new StringBuilder(str);
        List<Integer> positions = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();

        // Collect vowels and positions
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowelsSet.indexOf(c) != -1) {
                positions.add(i);
                vowels.add(c);
            }
        }

        // Reverse the entire vowel list
        Collections.reverse(vowels);

        // Put reversed vowels back
        for (int i = 0; i < positions.size(); i++) {
            result.setCharAt(positions.get(i), vowels.get(i));
        }

        return result.toString();

    }
}

