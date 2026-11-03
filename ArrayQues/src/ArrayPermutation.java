
//LeetCode 1920
import java.util.Scanner;

public class ArrayPermutation {

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
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

        int[] result = buildArray(nums);

        System.out.print("Result: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}