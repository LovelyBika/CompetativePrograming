import java.util.Scanner;

class armstrong_5{
    public static void main(String[] args) {
        int n,sum=0,r;
        System.out.println("Enter the No");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        int temp =n;
        while(n>0){
        r=n%10;
        sum =sum +(r*r*r);
        n=n/10;
        }
        if(temp==sum){
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }
    
    
    }
}