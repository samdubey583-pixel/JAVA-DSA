import java.util.Scanner;

public class RichestCustomer {

    static int richestCustomer(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        int richestCustomer = -1;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > max) {
                max = sum;
                richestCustomer = i;
            }
        }

        return richestCustomer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int m = scanner.nextInt();

        System.out.print("Enter number of bank accounts: ");
        int n = scanner.nextInt();

        int[][] accounts = new int[m][n];

        System.out.println("Enter account balances:");

        for (int i = 0; i < m; i++) {
            System.out.println("Customer " + (i + 1) + ":");

            for (int j = 0; j < n; j++) {
                accounts[i][j] = scanner.nextInt();
            }
        }

        int result = richestCustomer(accounts);

        System.out.println("Richest customer: Customer " + (result + 1));

        scanner.close();
    }
}