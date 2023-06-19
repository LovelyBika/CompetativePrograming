import java.util.Random;
import java.util.Scanner;

public class Randomw_6 {
    public static void main(String[] args) {
        Random rand =new Random();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range of no");
        int n=sc.nextInt();
        sc.close();
        int v= rand.nextInt(n);
        System.out.printf("Your random no having range upto %d is %d",n,v);
    }
}
