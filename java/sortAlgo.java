public class sortAlgo {
      

    static void bubbleSor(int ar[],int a){
         int temp;
      for(int i=0;i<a;i++){
        for(int j=i+1;j<a;j++){
               if(ar[i]>ar[j])
                  {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
        }
      }

      static void  mergeSort(){

      }
    
     for(int i=0;i<a;i++){
        System.out.print(ar[i]+" ");
     }
    }
    public static void main(String[] args) {
    int[] ar = {12,34,3,431,35,100,01};
 
   // bubbleSor(ar,ar.length);
   mergeSort(ar,ar.length);
    
}



}



