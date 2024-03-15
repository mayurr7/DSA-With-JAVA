import java.util.*;
public class prefixSum {
    static void printArray(int arr[]){
        for(int i = 1; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] makePrefixSum(int[] arr){
        for(int i =0; i < arr.length; i++){
            arr[i] += arr[i - 1];
        }
        return arr;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter size of array=");
         int n = sc.nextInt();
        int arr[] = new int[n];
       
        System.out.println("enter element of array");
         for(int j=0; j<arr.length; j++){
            arr[j] = sc.nextInt();
        }
        System.out.print("Array is =");
        System.out.println(Arrays.toString(arr));

        printArray(makePrefixSum(arr));
    }
}
