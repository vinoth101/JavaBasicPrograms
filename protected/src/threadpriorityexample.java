
 import java.lang.*;

 public class threadpriorityexample extends Thread
 {
     public void run()
     {
         System.out.println("Inside");
     }

     public static void main(String argvs[])
     {
         threadpriorityexample th1 = new threadpriorityexample();
         threadpriorityexample th2 = new threadpriorityexample();
         threadpriorityexample th3 = new threadpriorityexample();

         System.out.println("Priority of the thread th1 is : " + th1.getPriority());

         System.out.println("Priority of the thread th2 is : " + th2.getPriority());

         System.out.println("Priority of the thread th2 is : " + th2.getPriority());

         th1.setPriority(6);
         th2.setPriority(3);
         th3.setPriority(9);


         System.out.println("Priority of the thread th1 is : " + th1.getPriority());


         System.out.println("Priority of the thread th2 is : " + th2.getPriority());


         System.out.println("Priority of the thread th3 is : " + th3.getPriority());

         System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());

         System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

// Priority of the main thread is 10 now
         Thread.currentThread().setPriority(7);

         System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
     }
 }

