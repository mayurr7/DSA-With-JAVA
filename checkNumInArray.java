import java.util.Arrays;
import java.util.Scanner;

public class checkNumInArray {

    static int[] makeFrequencyArray(int arr[]){
        int freq[] = new int[100005];
        for(int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of Array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the element of array :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array :");
        System.out.println(Arrays.toString(arr));

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter number of queries = ");
        int t = sc.nextInt();

        while(t > 0){
            System.out.println("Enter numbers to be searched = ");
            int x = sc.nextInt();

            if(freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
