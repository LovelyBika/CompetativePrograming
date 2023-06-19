import java.util.Scanner;
public class Sumcolumn {
    public static void main(String[] args) {    
        int row, column, sumRow, sumCol;    
        int i, j;    
        //Initialize matrix a    
        int a[][] =new int[15][15];
          //Calculates number of rows and columns present in given matrix    
          Scanner sc = new Scanner(System.in); 
          //Taking number of rows and columns for both the matrices  
              System.out.println("Enter number of rows of the matrix");
               row=sc.nextInt();
              System.out.println("Enter number of columns of the matrix");
               column=sc.nextInt();  
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
        //Calculates sum of each row of given matrix    
        for( i = 0; i < row; i++){    
            sumRow = 0;    
            for( j = 0; j < column; j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    
            
        //Calculates sum of each column of given matrix    
        for(i = 0; i < column; i++){    
            sumCol = 0;    
            for(j = 0; j < row; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
}
