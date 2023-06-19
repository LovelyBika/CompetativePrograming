import java.util.Scanner;

public class primeNumber_2 {
    public static void main(String[] args) {
       int flag=0;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
        sc.close();
        if(n==0|| n==1)
         flag=1;
        for(int i=2;i<n;i++){
         if(n%i==0)
         {flag=1;
            break;}
         
        } 
        if(flag==0)
            System.out.println(n+" is prime no");
        else 
            System.out.println(n+ " is not a prime no");    
    }
}
