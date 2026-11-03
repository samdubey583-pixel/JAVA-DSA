//LeetCode 1929
import java.util.Scanner;
import java.util.Arrays;

public class ArrayConcatenation {

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n = nums.length;

        for (int i = 0; i < ans.length / 2; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = getConcatenation(nums);

        System.out.println("Concatenated array: " + Arrays.toString(result));

        scanner.close();
    }
}