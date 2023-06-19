public class opMatrix
{
    public static void main(String[] args) {
        int A[][]={
        {12,8,4},
        {3,17,14},
        {9,8,10}
};
int C[][]= new int[3][3];
int B[][]={
    {5,19,3},
    { 6,15,9},
    {7,8,16}

};

for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){ 
        C[i][j]=0;
        for(int k=0;k<3;k++){
            C[i][j]+=A[i][k]*B[k][j];
            }
            System.out.print(C[i][j]+" ");
    
    } System.out.println("");
}
    


}
}


