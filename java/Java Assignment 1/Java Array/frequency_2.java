

public class frequency_2{
public static void main(String[] args) {
    int ar[]={1,2,2,3,4,5,6,5};
    int fr[] =new int[ar.length];
    int visited=-1;  
    int count;
    for(int i=0;i<ar.length;i++){ count =1;
        for(int j=i+1;j<ar.length;j++){  
           if(ar[i]==ar[j]){
              count++;
              fr[j]=visited;
            
            } 
        }  
        if(fr[i]!=visited)
           fr[i]=count;
    }
System.out.println("--------------------");
System.out.println("Eleemnt | Frequency");
System.out.println("---------------------");
for(int i=0;i<fr.length;i++){
   if(fr[i]!=visited){
    System.out.println("     "+ ar[i]+" | "+fr[i]);
   }
}
System.out.println("--------------------");
}




}