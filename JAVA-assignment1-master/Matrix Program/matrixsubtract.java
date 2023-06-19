import java.util.Scanner;
public class matrixsubtract {
    public static void main(String args[]){  
        int i,j;
        //creating two matrices    
        int a[][]=new int[15][15];    
        int b[][]=new int[15][15];    
        //creating another matrix to store the difference of two matrices    
        int c[][]=new int[15][15];    
    Scanner sc = new Scanner(System.in); 
    //Taking number of rows and columns for both the matrices  
    System.out.println("Enter number of rows of first matrix");
    int row=sc.nextInt();
    System.out.println("Enter number of columns of first matrix");
    int column=sc.nextInt();
    for(i=0;i<row;i++){    
        for(j=0;j<column;j++){    
            System.out.println(String.format("Enter the first [%d][%d] element",i,j));
            a[i][j]=sc.nextInt();}}
 
    for( i=0;i<row;i++){    
        for( j=0;j<column;j++){
            System.out.println(String.format("Enter the second [%d][%d] element",i,j));
            b[i][j]=sc.nextInt();}        }
            sc.close();
        System.out.println("First Matrix");
            for( i=0;i<row;i++)      
                { for(j=0; j<column; j++)   
                    {System.out.print(a[i][j]+"\t");}
                     System.out.println();}
        System.out.println("Second Matrix");
            for( i=0;i<row;i++)      
                { for( j=0; j<column; j++)   
                    {System.out.print(b[i][j]+"\t");}
                     System.out.println(); }               
            for( i=0;i<row;i++)      
            { for(j=0; j<column; j++)     
            {   c[i][j]=a[i][j]-b[i][j];}      
            }
            System.out.println("Subtracted Matrix");
            for(i=0;i<row;i++)      
                { for( j=0; j<column; j++)   
                    {System.out.print(c[i][j]+"\t");}
                    System.out.println();
        }}           
}
