//LeetCode 1832

import java.util.Scanner;

public class CheckPangram {

    static boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int index = ch - 'a';

            seen[index] = true;
        }

        for (int i = 0; i < seen.length; i++) {
            if (!seen[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println(checkIfPangram(sentence));

        sc.close();
    }
}