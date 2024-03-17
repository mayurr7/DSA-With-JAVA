//Q.1) Given an array consist postive intterger valuues return the first value that repeating in this array, If no then print -1 ?

import java.util.*;
public class firstRepeatingNum {
    static int firstRepeatingnum(int arr[]){
        
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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

        System.out.println(firstRepeatingnum(arr));

    }
}
