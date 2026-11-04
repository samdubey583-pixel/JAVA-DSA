import java.util.Scanner;

public class NumberOfGoodPairs {

    static int numIdenticalPairs(int[] nums) {

        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    goodPairs++;
                }

            }
        }

        return goodPairs;
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

        int result = numIdenticalPairs(nums);

        System.out.println("Number of good pairs: " + result);

        scanner.close();
    }
}