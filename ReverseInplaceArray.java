import java.util.Arrays;
import java.util.Scanner;

public class ReverseInplaceArray {

    static void swappArrayy(int arr[] , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   static void reverseArray(int arr[]){
    int i=0; int j= arr.length-1;
    while (i < j) {
        swappArrayy(arr, i, j);
        i++;
        j--;
    }

   }
   static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
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
         for(int j=0; j<arr.length; j++){
            arr[j] = sc.nextInt();
        }
        System.out.print("Array is =");
        System.out.println(Arrays.toString(arr));

        System.out.println("Answer Array : ");
        reverseArray(arr);
        printArray(arr);
        
    }
}
