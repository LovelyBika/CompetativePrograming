
import java.util.Scanner;

public class rotateAr {
   
    public static void main(String[] args) {
        int ar[]={12,34,56,78,11,19};
        System.out.println("Enter the index to rotate array towards left");
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
       
        int temp,temp1;
        int size =ar.length;
        int j=1;
        for(int i=0;i<n;i++){
         temp=ar[i];
         temp1 =ar[size-j];
         ar[i]=ar[size-j];
         ar[size-j]=temp;
          j--;
        }
        // for(int val:ar){
        //     System.out.println(val);
        // }
}
}
