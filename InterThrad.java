package multithreading;
class Shared{
    synchronized void print(){
        try{
            wait();
        } catch(Exception e){ }
        System.out.println("Resumed Thread");
    }
    synchronized void resumeThread(){
        notify();
    }
}
public class InterThrad {
    public static void main(String[] args) {
        Shared obj = new Shared();
        Thread t1=new Thread(() -> obj.print());
        Thread t2=new Thread(() -> obj.resumeThread());
        t1.start();
        t2.start();
    }
}