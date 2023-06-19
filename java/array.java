import java.util.Scanner;

public class array {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int a[]= new int[20];   
    System.out.println("Enter the Element ");
    for(int i=0;i<4;i++)
     a[i]=in.nextInt();
    
    for(int i=0;i<4;i++){
        System.out.print(a[i]);
    }
    in.close();                         
    }
    
}
