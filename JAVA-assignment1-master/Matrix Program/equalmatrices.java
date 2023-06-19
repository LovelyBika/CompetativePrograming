import java.util.Scanner;
public class equalmatrices {
    public static void main(String args[]){  
        int i,j;
        boolean flag = true;
        //creating two matrices    
        int a[][]=new int[15][15];    
        int b[][]=new int[15][15];      
    Scanner sc = new Scanner(System.in); 
    //Taking number of rows and columns for both the matrices  
    System.out.println("Enter number of rows of first matrix");
    int row1=sc.nextInt();
    System.out.println("Enter number of columns of first matrix");
    int column1=sc.nextInt();
    System.out.println("Enter number of rows of second matrix");
    int row2=sc.nextInt();
    System.out.println("Enter number of columns of second matrix");
    int column2=sc.nextInt();
    if((row1 != row2)||(column1 != column2))
    {
        System.out.print("The matrices are not equal");
    }
    else
    {for(i=0;i<row1;i++){    
        for(j=0;j<column1;j++){    
            System.out.println(String.format("Enter the first [%d][%d] element",i,j));
            a[i][j]=sc.nextInt();}}
    for(i=0;i<row2;i++){    
        for(j=0;j<column2;j++){
            System.out.println(String.format("Enter the second [%d][%d] element",i,j));
            b[i][j]=sc.nextInt();}        
                }
    sc.close();
        System.out.println("First Matrix");
            for( i=0;i<row1;i++)      
                { for(j=0; j<column1; j++)   
                    {System.out.print(a[i][j]+"\t");}
                     System.out.println();}
        System.out.println("Second Matrix");
            for( i=0;i<row2;i++)            { 
                for( j=0; j<column2; j++)   
                    {System.out.print(b[i][j]+"\t");}
                     System.out.println(); }             
        
        for(i=0;i<row1; i++){
            for(j=0; j<column1; j++){
                if(a[i][j] != b[i][j]){
                     flag = false;
                    break;             }                   
                                    }  
                            }
        if(flag){
            System.out.print("The matrices are equal");
        }
        else{
            System.out.print("The matrices are not equal");
        }
}}}
