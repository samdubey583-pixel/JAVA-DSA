import java.sql.SQLOutput;
import java.util.Scanner;

public class LC1281 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scanner.nextInt();
        int prodDig=1;
        int sumDig=0;

        while (n>0){
            prodDig *= n%10;
            sumDig += n%10;
            n=n/10;
        }
        System.out.println(prodDig-sumDig);

    }
}
