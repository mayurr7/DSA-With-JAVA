import java.util.*;

public class findSecondMaxValue {
    static int findMaxValue(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
               
             max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMaxvalue(int arr[]){
        int max = findMaxValue(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int findSecondMaxvalue = findMaxValue(arr); //ya array vr aapn vrcha array findmax call kelo
        return findSecondMaxvalue ;
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

         System.out.println(findSecondMaxvalue(arr));
    }   
}
