import java.util.Scanner;

import static java.lang.Math.min;

public class HCFLCM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int limit=min(a,b);
        int hcf = 0;

        for (int i =1; i<=limit ;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        int lcm=(a*b)/hcf;
        System.out.println("Hcf is: "+ hcf);
        System.out.println("LCM is: "+ lcm);

    }
}
