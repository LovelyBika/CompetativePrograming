
import java.util.Scanner;



public class pallindrome_3 {
    public static void main(String[] args) {
    
    String Original,reverse="";
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter ");
    Original =sc.nextLine();
    sc.close();
     
    int n=Original.length();
    
    for(int j=n-1;j>=0;j--){
        reverse= reverse+ Original.charAt(j); 
        }
     if(Original.equals(reverse)){
        System.out.println("String is Pallindrome");
     }   
     else{
        System.out.println("String is not Pallindrome");
     }
   
}
}