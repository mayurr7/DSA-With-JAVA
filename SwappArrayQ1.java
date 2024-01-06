//Q.1)Swapping an Array element

import java.util.Arrays;
public class SwappArrayQ1 {
     public static void main(String[] args) {
        
        int arr[] = new int[]{1, 2 , 3 , 4, 5};

        Swapp(arr, 1, 3);  //abstract method
        System.out.println(Arrays.toString(arr));
    }
    static void Swapp(int arr[], int index1, int index3)//implimentation of abstract method
    {
            int temp = arr[1];
            arr[index1] = arr[3];
            arr[3] = temp;
        
    }

}


