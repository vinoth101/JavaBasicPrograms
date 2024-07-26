import java.util.Scanner;

public class swaptwonumber {
    public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        int a=si.nextInt();
        int b=si.nextInt();
        a=a+b;
       b=a-b;
       a=a-b;
        System.out.println(a+""+b);

    }
}
