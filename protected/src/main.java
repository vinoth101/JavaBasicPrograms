class sec{
     sec(){


            System.out.println("dsscs");

    }
}
class de extends sec{
     de(){
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}}




    public class main {
    public static void main(String[] args) {
        de e=new de();
    }
}
