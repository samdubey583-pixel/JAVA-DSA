import java.util.Scanner;

public class PythaTrip {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int n1= scanner.nextInt();
        System.out.print("Enter num 2: ");
        int n2= scanner.nextInt();
        System.out.print("Enter num 3: ");
        int n3=scanner.nextInt();

        boolean res= pythaTrip(n1,n2,n3);

        if (res){
            System.out.println("pytha trip");
        }else{
            System.out.println("Not a pytha trip");
        }


    }

    static boolean pythaTrip(int n1,int n2 , int n3){
        double sqn1=Math.pow(n1,2);
        double sqn2=Math.pow(n2,2);
        double sqn3=Math.pow(n3,2);

        if(sqn1 + sqn2 == sqn3 || sqn1 + sqn3 == sqn2 || sqn2 + sqn3 == sqn1 ){
            return true;
        }
        else{
            return false;
        }
    }
}


