// Find the total Numbers of Pairs in the array whose sum is equal to the given value target

import java.util.*;
public class PairSum {

    static int Pairsum(int[] arr , int target){
        int ans=0;
       
        for(int i=0; i<arr.length; i++){ 
            for(int j=i+1; j<arr.length; j++){ 
                if(arr[i]+ arr[j]==target){
                    ans ++;
                }
            }
        }
        return ans;

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

        System.out.println("Enter target =");
        int target = sc.nextInt();

        System.out.println("pair of sum = ");
        System.out.println(Pairsum(arr , target));
    }
   
}