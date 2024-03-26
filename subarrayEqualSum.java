import java.util.Arrays;
import java.util.Scanner;

public class subarrayEqualSum {
    public static int arrayTotalSum(int[] arr){
        int totalSum = 0;
        for(int i = 0; i<arr.length; i++){
            totalSum +=arr[i];
        }
        return totalSum;
    }

    public static boolean equalSumPartiation(int arr[]){
       int totalSum =arrayTotalSum(arr);

       int prefixSum = 0;
       for(int i =0; i<arr.length; i++){
            prefixSum += arr[i];

            int sufixSum = totalSum - prefixSum;
            if(prefixSum==sufixSum){
                return true;
            }
       }
       return false;
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

            System.out.println("Equal sum partation Possible : " + equalSumPartiation(arr));
    }
}
