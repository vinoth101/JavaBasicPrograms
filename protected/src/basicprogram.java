import java.util.Scanner;

public class basicprogram {
    public static void main(String[] args) {
        int n;
        Scanner  s=new Scanner(System.in);
        n=s.nextInt();
       int  arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        int a=0,b=0,c=0,d=0,e=0;
        for(int i=0; i<n; i++)
        {
            arr[i]=s.nextInt();

            if(arr[i]>0){a++;}
            if(arr[i]<0){b++;}
            if (arr[i] % 2 == 1) {
            c++;}
            if(arr[i]%2==0){if(arr[i]>0)d++;}
            if(arr[i]==0){e++;}

        }
        System.out.println("positive numbers"+a+"\nnegative numbers"+b+"\nodd numbers"+c+"\nEven numbers"+d+"\nZero's"+e);
    }
}
