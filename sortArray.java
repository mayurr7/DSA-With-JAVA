// Sort an array consisting of only 0s and 1s
import java.util.*;

public class sortArray {

    
    static void printAns(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // static void swapp(int arr[], int i, int j){
    //     int temp =arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    static void after(int arr[]){
        int n = arr.length;
        int zeroes = 0;
        //count number of zeroes
        
    
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        //0 to zeroes-1 ; 
        for(int i = 0; i<arr.length; i++){
            if(i < zeroes){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
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
           // System.out.println(Arrays.toString(arr));

            printAns(arr);

            after(arr);
            System.out.println("Sorted Array = ");
            printAns(arr);
         
         

    }
}
