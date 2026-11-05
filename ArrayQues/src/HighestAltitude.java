import java.util.Scanner;

public class HighestAltitude {

    static int largestAltitude(int[] gain) {

        int high = Integer.MIN_VALUE;
        int[] ans = new int[gain.length + 1];

        ans[0] = 0;

        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] + gain[i - 1];
        }

        for (int i = 0; i < ans.length; i++) {
            if (high < ans[i]) {
                high = ans[i];
            }
        }

        return high;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of gains: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter the gains:");

        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        System.out.println("Highest altitude: " + largestAltitude(gain));

        sc.close();
    }
}