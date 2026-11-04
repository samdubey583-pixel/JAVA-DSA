//LeetCode 1389

import java.util.Scanner;
import java.util.Arrays;

public class CreateTargetArray {

    static int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i - 1; j >= index[i]; j--) {
                target[j + 1] = target[j];
            }

            target[index[i]] = nums[i];
        }

        return target;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        System.out.println("Enter nums elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter index elements:");
        for (int i = 0; i < n; i++) {
            index[i] = scanner.nextInt();
        }

        int[] result = createTargetArray(nums, index);

        System.out.println("Target array: " + Arrays.toString(result));

        scanner.close();
    }
}