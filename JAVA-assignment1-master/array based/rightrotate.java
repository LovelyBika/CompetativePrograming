public class rightrotate {
    void rotateright(int arr[], int d, int n){
        while(d>n){
            d=d-n;
        }
        //Creating a temporary array of size d
        int temp[] = new int[n-d];
        //Now copying first N-D element in array temp
        for(int i=0; i<n-d; i++)
        temp[i]=arr[i];
        //Moving the rest element to index zero to D
        for(int i=n-d; i<n; i++){
            arr[i-n+d]=arr[i];
        }
        //Copying the temp array element 
        //in original array
        for(int i=0; i<n-d; i++){
            arr[i+d]=temp[i];
        }
    }
//Print the array
void printArray(int arr[], int n)
{
    for(int i=0; i<n; i++)
    System.out.print(arr[i]+" ");
}
//Main driver method
public static void main(String[] args) {
    //Creating an object of class inside main()
    rightrotate r = new rightrotate();
    //Custom input array
    int arr[]={1, 2, 3, 4, 5};
    //Calling method 1 and 2 as defined above
    r.rotateright(arr, 2, arr.length);
    r.printArray(arr, arr.length);
}
}
