//LeetCode 1365
import java.util.Scanner;
import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            ans[i] = count;
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

        int[] result = smallerNumbersThanCurrent(nums);

        System.out.println("Result: " + Arrays.toString(result));

        scanner.close();
    }
}