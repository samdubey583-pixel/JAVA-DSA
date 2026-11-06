//LeetCode 1295
import java.util.Scanner;

public class FindNumbers {

    static int findNumbers(int[] nums) {

        int num = 0;

        for (int i = 0; i < nums.length; i++) {

            int dig = 0;
            int temp = nums[i];

            while (temp > 0) {
                temp = temp / 10;
                dig++;
            }

            if (dig % 2 == 0) {
                num++;
            }
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Numbers with even digits: " + findNumbers(nums));

        sc.close();
    }
}