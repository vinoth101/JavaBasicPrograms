import java.util.Scanner;

public class SBI extends bank{
    void interest(){
        int r=7,si;
        si=(p*no*r)/100;
        System.out.println("interested \n"+si);
    }

    public static void main(String[] args) {
       SBI s=new SBI();
       s.input();
       s.interest();
    }
}
