import java.util.Scanner;

class sim1{
    void call(long phno){
        System.out.println(phno+"is calling from sim1");
    }
}
public class sim2 extends sim1{
    @Override
    void call(long phno){
        System.out.println(phno+"is calling from sim2");
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the phone number");
        long phno=s.nextLong();
        System.out.println("1.SIM1\n2.SIM2\n select any 1:");
        int a=s.nextInt();
        if(a==1){
            sim1 n=new sim1();
            n.call(phno);
        } else if (a==2) {
            sim2 r=new sim2();
            r.call(phno);

        }
        else{
            System.out.println("invalid option");
        }
    }
}
