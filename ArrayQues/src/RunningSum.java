import java.util.Scanner;
import java.util.Arrays;

public class RunningSum {

    static int[] runningSum(int[] nums) {

        int[] ans = new int[nums.length];

        ans[0] = nums[0];

        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
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

        int[] result = runningSum(nums);

        System.out.println("Running Sum: " + Arrays.toString(result));

        scanner.close();
    }
}