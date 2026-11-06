//LeetCode 1252

import java.util.Scanner;

public class OddCells {

    static int oddCells(int m, int n, int[][] indices) {

        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {

            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < n; j++) {
                ans[row][j]++;
            }

            for (int j = 0; j < m; j++) {
                ans[j][col]++;
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        System.out.print("Enter number of operations: ");
        int k = sc.nextInt();

        int[][] indices = new int[k][2];

        System.out.println("Enter row and column coordinates:");

        for (int i = 0; i < k; i++) {
            indices[i][0] = sc.nextInt();
            indices[i][1] = sc.nextInt();
        }

        System.out.println("Number of odd cells: " + oddCells(m, n, indices));

        sc.close();
    }
}