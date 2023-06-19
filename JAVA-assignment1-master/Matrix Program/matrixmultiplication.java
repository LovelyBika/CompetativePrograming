import java.util.Scanner;
public class matrixmultiplication {
    public static void main(String args[]){  
        //creating two matrices    
        int a[][]=new int[15][15];    
        int b[][]=new int[15][15];    
    
        //creating another matrix to store the multiplication of two matrices    
        int c[][]=new int[15][15];  //3 rows and 3 columns  
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter number of rows of first matrix");
    int row1=sc.nextInt();
    System.out.println("Enter number of columns of first matrix");
    int column1=sc.nextInt();
    System.out.println("Enter number of rows of second matrix");
    int row2=sc.nextInt();
    System.out.println("Enter number of columns of second matrix");
    int column2=sc.nextInt();
    if(column1 == row2)
        //multiplying and printing multiplication of 2 matrices    
     {   for(int i=0;i<row1;i++){    
        for(int j=0;j<column1;j++){    
            System.out.println(String.format("Enter the first [%d][%d] element",i,j));
            a[i][j]=sc.nextInt();}}
 
        for(int i=0;i<row2;i++){    
        for(int j=0;j<column2;j++){
            System.out.println(String.format("Enter the second [%d][%d] element",i,j));
            b[i][j]=sc.nextInt();}        
        }
        sc.close();
        for(int i=0;i<row1;i++)      
        { for(int j=0; j<column2; j++)     
        {   c[i][j]=a[i][j]*b[i][j];}      
        }
        System.out.println("Multiplied Matrix");
        for(int i=0;i<row1;i++)      
            { for(int j=0; j<column2; j++)   
                {
                    System.out.print(c[i][j]+"\t");
                }
    }}
    else{
        System.out.print("Multiplication is not possible");
    }
}}


        