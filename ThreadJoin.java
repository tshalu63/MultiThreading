package multithreading;
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.println("Child Thread: "+i);
        }
    }
}
public class ThreadJoin {
    public static void main (String[] args) throws Exception{
        MyThread t1=new MyThread();
        t1.start();
        t1.join();
        System.out.println("Main Thread Ends");
    }
}
