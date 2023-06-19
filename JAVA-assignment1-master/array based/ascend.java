public class ascend {
    public static void main(String[] args) {
        int arr[]=new int[]{5, 2, 6, 8, 3, 1};
        int temp;
        System.out.println("Elements in the array");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+"");
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println("Elements in ascending order are: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+"");
        }
    }    
}
