
public class copyEle_1 {
    public static void main(String[] args) {
        int [] ar={1,23,44,90,49};
        final int size = ar.length;
        int  ar2[] = new int[size]; 
        for(int i=0;i<size;i++){
            ar2[i]=ar[i];
           }
           System.out.print("Original Array: \n");
           for(int i:ar){
           
            System.out.println(i);
        }
        System.out.print("Copied Array: \n");
        for(int j:ar2){
           
            System.out.println(j);
        }

    }    
}
