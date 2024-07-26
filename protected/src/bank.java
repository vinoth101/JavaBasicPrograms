import java.util.Scanner;

public abstract class bank {
    int p,no;
    Scanner s=new Scanner(System.in);
    void input(){
        System.out.println("enter the amount");
        p=s.nextInt();
        System.out.println("enter the year");
        no=s.nextInt();
            }
            abstract void interest();
}
