//LeetCode 1431
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class KidsWithCandies {

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        // Find maximum original candies
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        // Check each kid after giving extra candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of kids: ");
        int n = scanner.nextInt();

        int[] candies = new int[n];

        System.out.println("Enter candies for each kid:");

        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extraCandies = scanner.nextInt();

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println("Result: " + result);

        scanner.close();
    }
}