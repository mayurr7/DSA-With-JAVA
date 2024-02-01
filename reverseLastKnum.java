//Q)..Rotate the given array "a" by k step where k is non negative number without using extra space
import java.util.*;;
public class reverseLastKnum {

    static void rotateArray(int arr[] , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void rotate(int arr[], int i, int j){
        
        while (i < j) {
            rotateArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void roateInPlace(int arr[], int k){
        int n = arr.length;
        k = k% n;
        
        rotate(arr,0, n-k-1);
        rotate(arr, n-k, n-1);
        rotate(arr, 0, n-1);
    }

    static void printArray(int arr[]){
        System.out.println("new Array= ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size= ");
        int size = sc.nextInt();
        int arr[] = new int[size];
         
        System.out.print("Enetr element of array= ");
        for(int i = 0; i <= size-1; i++){
            arr[i] = sc.nextInt();            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter k = ");
        int k = sc.nextInt();

            roateInPlace(arr, k);
            printArray(arr);
        
    }
}
