import java.util.Arrays;
import java.util.Scanner;

public class sufixSum {
        public static int[] sufixArraySum(int arr[]){
            
            for(int i = arr.length-2 ; i>=0; i--){
               arr[i] =  arr[i+1] +arr[i];
            }
        return arr;
           
        }
        

        static void printArray(int arr[]){
            for(int i = 0; i< arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array =");
        int n =sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter Element of an array = ");
         for(int i = 0; i<arr.length; i++ ){
            arr[i]= sc.nextInt();
            }

            System.out.println("The given array = ");
            System.out.println(Arrays.toString(arr));

        sufixArraySum(arr);
        printArray(arr);
    }
}
