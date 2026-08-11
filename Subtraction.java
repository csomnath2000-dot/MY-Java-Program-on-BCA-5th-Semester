package RIIT;
import java .util.Scanner;
public class Subtraction{
    public static void main(String[]A){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Num: =");
        int Num1 = sc.nextInt();
        System.out.println("Enter the the 2nd Num");
        int Num2 = sc.nextInt();
        int Sub= Num1 - Num2;
        System.out.println("The Final Result="+Sub);
    }
}