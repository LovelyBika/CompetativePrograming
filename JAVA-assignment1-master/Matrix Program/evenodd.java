import java.util.Scanner;
public class evenodd {
    public static void main(String args[]){  
        int i,j;
        int counteven=0, countodd=0;
        //creating two matrices    
        int a[][]=new int[15][15];      
    Scanner sc = new Scanner(System.in); 
    //Taking number of rows and columns for both the matrices  
        System.out.println("Enter number of rows of the matrix");
        int row=sc.nextInt();
        System.out.println("Enter number of columns of the matrix");
        int column=sc.nextInt();   
        for(i=0;i<row;i++){    
            for(j=0;j<column;j++){    
                System.out.println(String.format("Enter the [%d][%d] element",i,j));
                a[i][j]=sc.nextInt();}}
                sc.close();
        System.out.println("The matrix is:");
            for( i=0;i<row;i++)      
            { for(j=0; j<column; j++)   
                {System.out.print(a[i][j]+"\t");}
                 System.out.println();}
        
            for(i=0; i<row; i++){
                for(j=0; j<column; j++){
                    if(a[i][j]%2 != 0){
                        countodd++;}
                    else{
                        counteven++;
                    }}}
        System.out.println("Frequency of odd numbers: " + countodd);    
        System.out.println("Frequency of even numbers: " + counteven);  
}}
    

