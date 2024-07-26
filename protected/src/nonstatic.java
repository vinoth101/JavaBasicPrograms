class demo{
    public static void show(){
        System.out.println("heloo");
    }
    public   void dis(){
        show();
    }
}
public class nonstatic {
    public static void main(String[] args) {

        demo d=new demo();
        d.dis();

    }
}
