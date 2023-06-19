import java.util.Scanner;
public class upper {
    public static void main(String args[]){  
        int i,j;
        //creating two matrices    
        int a[][]=new int[15][15];      
    Scanner sc = new Scanner(System.in); 
    //Taking number of rows and columns for both the matrices  
        System.out.println("Enter number of rows of the matrix");
        int row=sc.nextInt();
        System.out.println("Enter number of columns of the matrix");
        int column=sc.nextInt();
        if(row != column){    
            System.out.println("Matrix should be a square matrix");    
        } 
        else{   
        for(i=0;i<row;i++){    
            for(j=0;j<column;j++){    
                System.out.println(String.format("Enter the first [%d][%d] element",i,j));
                a[i][j]=sc.nextInt();}}
                sc.close();
        System.out.println("First Matrix");
            for( i=0;i<row;i++)      
            { for(j=0; j<column; j++)   
                {System.out.print(a[i][j]+"\t");}
                 System.out.println();}
        System.out.println("Upper Triangular Matrix");
            for(i=0; i<row; i++){
                for(j=0; j<column; j++){
                    if(i>j){
                        System.out.print("0 ");}
                    else{
                        System.out.print(a[i][j]+" ");//difference of print and println
                    }}
                    System.out.println();     
                } 
}}}
