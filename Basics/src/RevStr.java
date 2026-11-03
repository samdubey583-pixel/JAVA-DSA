import java.util.Scanner;

public class RevStr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s1 = scanner.nextLine();
        String rev="";
        for (int i=(s1.length()-1);i>=0;i--){
            rev += s1.charAt(i);
        }
        System.out.println(rev);
    }
}
