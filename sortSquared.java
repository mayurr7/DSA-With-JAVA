/*Given  an integer Array "a" sorted in non-decreasing order return an Array of the Squre 
of each number sorted in non-decreasing order */
import java.util.*;
public class sortSquared {
    static void printArray(int ans[]){
        for(int i =0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    // static void reverse(int[] ans){
    //     for(int i = ans.length - 1; i>=0; i--){
    //         System.out.print(ans[i] + " ");
    //     }
    // }

    static void sortSquaredArray(int[] arr){
            int n = arr.length;
            int left =0;
            int right = n-1;
           // int k=0;
           int k = n-1; //for reversing during while loop
            int[] ans = new int[n];

            while(left <=  right){
                if(Math.abs(arr[left]) > Math.abs(arr[right])){
                    // ans[k++] = arr[left] * arr[left];
                    ans[k--] = arr[left] * arr[left];
                    left++;

                }else{
                    // ans[k++] = arr[right] * arr[right];
                    ans[k--] = arr[right] * arr[right];
                    right--;
                }
            }
            //reverse(ans);
            printArray(ans);
            
            

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of array= ");
        int n = sc.nextInt();
        int arr[] = new int[n];


        System.out.println("Enter element of array = ");
        for(int i =0; i<arr.length; i++){
           arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        sortSquaredArray(arr);
    
    }
}
