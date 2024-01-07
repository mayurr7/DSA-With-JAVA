import java.util.Arrays;
import java.util.Scanner;

public class UniqueValue {
    static int uniqueValue(int arr[]){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                     arr[j] = -1;

                }
            }
        }
        int ans= -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != -1){
                ans = arr[i];
           
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

       

        
         System.out.println("Unique number = " +uniqueValue(arr));
         
        
    }
}
