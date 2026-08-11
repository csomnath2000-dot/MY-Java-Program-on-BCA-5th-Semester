package RIIT;
import java .util.Scanner;
public class Addition{
    public static void main(String[]A){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Num: =");
        int Num1 = sc.nextInt();
        System.out.println("Enter the the 2nd Num");
        int Num2 = sc.nextInt();
        int Add = Num1 + Num2;
        System.out.println("The Final Result="+Add);
    }
}