public class multithreatningsetname extends Thread {
public void run(){
    System.out.println("running");
}

    public static void main(String[] args) {
        multithreatningrunable m=new multithreatningrunable();
        multithreatningrunable n=new multithreatningrunable();
        System.out.println("Name of t1:"+m.getName());
        System.out.println("Name of t2:"+n.getName());
        m.start();
        n.start();
        m.setName("vinothkuamr");
        System.out.println("dwdwf"+m.getName());
    }
}
