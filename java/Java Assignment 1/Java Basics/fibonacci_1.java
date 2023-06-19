import java.util.Scanner;

class fibonacci{
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int temp=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required length of fibo series");
         int n= sc.nextInt();
        sc.close(); 
        System.out.printf("Your Fibo Series %d %d",n1,n2);
        while(n>=0){
         temp=n1+n2;
         n1=n2;
         n2=temp;

          System.out.printf(" %d",temp);
          n--;
        }

    }
}