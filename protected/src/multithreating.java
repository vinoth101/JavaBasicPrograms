class bike extends Thread{
   public void run(){
       try { for(int i=1;i<5;i++) {
           Thread.sleep(1000);
           System.out.println(i);
       } }
       catch (Exception e) {
           System.out.println(e);}
    }
}


public class multithreating {
    public static void main(String[] args) {
        bike e=new bike();
        e.start();
    }
}
