import java.util.*;
public class evenOddSortArray {
    
    static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }
    static void swapp(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void evenOddSortarray(int[] arr){
        int left = 0;
        int right =arr.length-1;
        while (left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 ==0){
                swapp(arr, left, right);
                left ++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        
           

        }
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

       printArray(arr);
       System.out.println();
        System.out.println("Printed Array =");
        evenOddSortarray(arr);
        printArray(arr);
    }
}
