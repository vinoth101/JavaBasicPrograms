public class multiplecatch {
    public static void main(String[] args) {
        try{
            int[]a=new int[12];
            a[21]=45/5;
            System.out.println("value="+a[21]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of index");
        }

    }
}
