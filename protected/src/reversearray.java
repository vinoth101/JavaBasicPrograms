import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
      Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int i;
        int  arr[]=new int[n];
        for( i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
         for (i= arr.length-1;i>=0;i--){
    System.out.println(arr[i]);
}

    }
}
