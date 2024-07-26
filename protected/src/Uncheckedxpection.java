import java.util.Scanner;

public class Uncheckedxpection {
    public static void main(String[] args) {
       int a=0,b=0,c;
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("enter the 1st no");
            String n=s.next();
            a=Integer.parseInt(n);
            System.out.println("enter the 2nd no");
            String n1=s.next();
            b=Integer.parseInt(n1);
        }
        catch (NumberFormatException e){
            System.out.println("only digit accepted...");
        }
        c=a+b;
        System.out.println("sum="+c);
        try{
            c=a/b;
            System.out.println("divided="+c);
        }
        catch(ArithmeticException e){
            System.out.println("can't divide a num by zero");
        }
        c=a-b;
        System.out.println("sum="+c);
}}
