import java.util.*;
public class randomnumber {
    public static void main(String args[]) {
        //Create random object 
        Random randomno = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many random numbers do you need :");
        int n= sc.nextInt();
        //check next int value
        for(int i=0; i<n; i++){
            System.out.println(randomno.nextInt());
        }
    }
}
