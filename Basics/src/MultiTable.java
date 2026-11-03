import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
        System.out.print("enter a no: ");
        int num=scanner.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num +" x "+ i +" " +"= "+ num*i);
        }
    }
}
