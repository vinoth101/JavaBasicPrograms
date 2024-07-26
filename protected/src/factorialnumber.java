import java.util.*;
public class factorialnumber {
    public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        int number=si.nextInt();
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial "+number+" is:"+fact);
    }
}

