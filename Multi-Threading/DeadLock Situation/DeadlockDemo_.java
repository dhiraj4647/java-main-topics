class A{
    public synchronized void d1(B b){
        System.out.println("In A class d1 method");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){}

        b.last();
        System.out.println("End of A class d1 method ");
    }
    public synchronized void last(){
        System.out.println("A class last method");
    }
}
class B{
    public synchronized void d1(A a){
        System.out.println("In B class d1 method");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){}
        a.last();
        System.out.println("End of B class d1 method ");
    }
    public synchronized void last(){
        System.out.println("B class last method");
    }
}
public class DeadlockDemo_ extends Thread{
    A a = new A();
    B b = new B();
    void m1(){
        this.start();
        a.d1(b);//executed by main thread
    }
    public void run(){
        b.d1(a);//executed by child thread
    }
    public static void main(String [] args){
        DeadlockDemo_ d = new DeadlockDemo_();
        d.m1();
    }
}
/*
 1)If two threads are waiting for each other foreever such type of infinite waiting is called
 Deadlock situation.
 2)synchronized kw is the only reason for deadlock situation, hence while using this kw we have
 too take special care 
 3)There are no resolution technique for deadlock but several prevention technique are avialable.
 4)In the aboove program iif we remove at least one synchronized kw then program won't enter into 
 deadelock hence synchroonized kw is only reason for deadlock situation due to this whicle
 using the synchronized kw we have to take special take care.
 5)Long waiting of a thread where waiting never ends is called deadlock
 6)whereas long waiting of a thread where waiting ends at certain point is callled starvation.
 for ex: low priority has to wait until completing the high priority threads it may be long waiting
 but ends at certain points, which is nothing but starvation.

 */