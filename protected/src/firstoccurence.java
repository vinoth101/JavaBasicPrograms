import java.util.Scanner;

public class firstoccurence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String f=s.next();
        String Str = "Azure is a Microsoft cloud. Azure is cost efficient";
        System.out.println(Str.indexOf(f));
    }
}
