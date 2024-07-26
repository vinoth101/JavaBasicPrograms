import java.util.Arrays;
import java.util.Scanner;

public class removeduplicate {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();

        int  arr[]=new int[n];
        for( int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[arr.length - 1];
        for (int k = 0; k < j; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
