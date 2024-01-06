//Q)2. Finding a max and min vale in arrays
import java.util.*;
public class MaxValueArrayQ2 {
    public static void main(String[] args) {
        int arry[] = new int[]{10, 5, 55, 66 ,10, 1};
       //For finding Max vale in Array
        int max = arry[0];
        for(int i=1 ; i< arry.length; i++){
            if(arry[i] > max){
                max = arry[i];
            }
        }
        System.out.println(max);

//Finding minimum value in array
        int min = arry[0];
        for(int i =1; i< arry.length ; i++){
            if(arry[i] < min){
                min = arry[i];
            }
        }
        System.out.println(min);
    }
}
