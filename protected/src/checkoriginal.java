import java.util.Arrays;
import java.util.Scanner;

public class checkoriginal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter 1st array length");
        int n=s.nextInt();
        int arr1[]=new int[n];

        System.out.println("1st array");
        for( int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("enter 2nd array length");
        int r=s.nextInt();
        int  arr2[]=new int[r];
        System.out.println("2nd array");
        for( int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

}

