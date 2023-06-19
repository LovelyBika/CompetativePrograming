import java.util.Scanner;

class condition {
public static void main(String args[]){
    Scanner scan= new Scanner(System.in);
    int N= scan.nextInt();
    scan.close();
    if(N%2!=0 && N>=6&& N<=20){
        System.out.println("Weird");
}                        
    else if(N%2==0 &&N>20)
{System.out.println("Not Weird");}
System.out.println("Not Weird");
}     
}
                            