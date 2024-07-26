class vk extends Thread{
    public void sd(){
        for(int i=1;i<10;i++){
            try {
                Thread.sleep(2000,2);
            } catch (InterruptedException e) { throw new RuntimeException(e);
            }
            System.out.println(i+"dsdsd");
        }

    }
}
public class multithreatningrunable extends Thread {
    public void run(){
        for(int i=1;i<10;i++){
            try {
                Thread.sleep(2000,2);
            } catch (InterruptedException e) { throw new RuntimeException(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String args[]){
        multithreatningrunable r=new multithreatningrunable();
        vk n=new vk();
        r.start();
        r.start();
    }

}
