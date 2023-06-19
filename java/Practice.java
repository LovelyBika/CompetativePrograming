import java.util.Scanner;

public class Practice {
    


public static void main(String[] args) {
     System.out.println("Enter the no.");
     Scanner sc= new Scanner(System.in);
     int i = sc.nextInt();
     
     String ch = sc.next(); 

     int j= sc.nextInt();
    sc.close();
    switch(ch){
        case "+" : System.out.printf("=%d\n",i+j);
                    break;
        case "-" : System.out.printf("=%d\n",i-j);
                    break;
       case "*" : System.out.printf("=%d\n",i*j);
                    break;
        case "/" : System.out.printf("=%d\n",i/j);
                    break;
        default: System.out.println("Error");            
                     break;
 
    }
}

}
