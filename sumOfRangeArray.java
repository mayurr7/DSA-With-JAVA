//The statrting range l and last range r find the sum between this range

import java.util.Arrays;
import java.util.Scanner;

public class sumOfRangeArray {
    public static int[] makePrefixSum(int[] arr){
         for(int i = 1; i< arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    
    static void printArray(int arr[]){
        for(int i =1; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter size of array=");
         int n = sc.nextInt();
        int arr[] = new int[n];
       
        System.out.println("enter element of array");
         for(int j=1; j<arr.length; j++){
            arr[j] = sc.nextInt();
        }
        System.out.print("Array is =");
       printArray(arr);

        int[] prefixSum = makePrefixSum(arr);

       System.out.println("Enter number of queries = ");
       int q=sc.nextInt();

      

       while (q-- > 0) {
        System.out.println("Enter range : ");
        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = prefixSum[r] - prefixSum[l-1];

        System.out.println("Sum = " +ans);
       }
        

    }
}
