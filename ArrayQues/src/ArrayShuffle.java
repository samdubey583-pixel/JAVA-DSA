//LeetCode 1470
import java.util.Scanner;
import java.util.Arrays;

public class ArrayShuffle {

    static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n (half the array size): ");
        int n = scanner.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = shuffle(nums, n);

        System.out.println("Shuffled array: " + Arrays.toString(result));

        scanner.close();
    }
}