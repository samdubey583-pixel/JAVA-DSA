import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int first=0;
        int sec=1;
        int next = 0;
        while (n>0){
            System.out.print(first+" ");

            next=first+sec;
            first=sec;
            sec=next;
            n--;
        }
    }
}
