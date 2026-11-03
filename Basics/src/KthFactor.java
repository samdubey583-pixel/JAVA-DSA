import java.util.Scanner;

public class KthFactor {

    static int kthFactor(int n, int k) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

                if (count == k) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        int result = kthFactor(n, k);

        System.out.println("Kth factor: " + result);

        scanner.close();
    }
}