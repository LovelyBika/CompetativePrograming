import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int num;
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to find ");
        num = sc.nextInt();
        for(int i=1; i<=num; ++i){
            factorial *= i;
        }
        System.out.println("Factorial of "+ num+" is " +factorial);
    }
}
