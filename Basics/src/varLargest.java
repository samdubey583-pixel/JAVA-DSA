import java.util.Scanner;

public class varLargest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scanner.nextInt();
        int largest=n;
        while(n != 0) {
            System.out.print("Enter num: ");
            n = scanner.nextInt();
            if (n>largest && n!=0){
            largest=n;
        }
    }
        System.out.println("Largest: " + largest);

    }
    }

