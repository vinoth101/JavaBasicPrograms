import java.util.*;
public class throwkeyword {
    void check(int age){
        if(age>=23){
            System.out.println("eligiblity");
            System.out.println("max=14000");
            System.out.println("interest=3.5");
        }
        else{
            throw new ArithmeticException("invalid\n to applyu loan in age 23");
        }
        System.out.println("click here to apply gold loan");
        System.out.println("click here to apply hhome loan");
    }
    public static void main(String[] args) {
        throwkeyword l=new throwkeyword();
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        l.check(age);

    }
}
