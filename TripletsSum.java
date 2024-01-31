//Q 2) Count the number of triplet whose sum = target

import java.util.Arrays;
import java.util.Scanner;

public class TripletsSum {
  
    static int tripletSum(int arr[] , int target){
        int ans=0;
        
        for(int i =0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                for(int k= j+1; k<arr.length; k++){
                    if(arr[i] +arr[j]+ arr[k]== target){
                    ans ++;
                    }
                }
            }
        }
        return ans;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array= ");
        int n= sc.nextInt();
         int arr[] = new int[n];

         System.out.println("Enter Element of an array = ");
         for(int i = 0; i<arr.length; i++ ){
            arr[i]= sc.nextInt();
         }

         System.out.println("The given array = ");
         System.out.println(Arrays.toString(arr));

         System.out.println("Enter target= ");
         int target = sc.nextInt();

         System.out.println("pair of Triplets= ");
         
        System.out.println(tripletSum(arr ,target));
    }
}
