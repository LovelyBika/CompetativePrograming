import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {    
        int row, column;    
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
                     int t[][] = new int[15][15];    
            
                     //Calculates transpose of given matrix    
                     for(i = 0; i < row; i++){    
                         for(j = 0; j < column; j++){    
                             //Converts the row of original matrix into column of transposed matrix    
                             t[i][j] = a[j][i];    
                         }    
                     }    
                     
            System.out.println("Transpose of given matrix: ");    
                for( i = 0; i < row; i++){    
                    for( j = 0; j < column; j++){    
                        System.out.print(t[i][j] + "\t"); }    
                         System.out.println();    
                     }    
                 }      
}
