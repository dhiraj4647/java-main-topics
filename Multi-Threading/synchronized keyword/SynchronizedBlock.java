class Display{
    public synchronized void wish(String name){
        ;;;;;;;;;//1 laik lines of code
        synchronized(this){
            for(int i=0;i<5;i++){
                System.out.print("Good Morning:");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException ie){
                     ie.printStackTrace();
                }
                System.out.println(name);
            }
        }
        
        ;;;;;;;;;;;;;;//1 lakh lines of code
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d =d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}

public class SynchronizedBlock {
    public static void main(String [] args){
        Display d1 = new Display();
        

        MyThread mt1 = new MyThread(d1, "Dhoni");
        MyThread mt2 = new MyThread(d1, "Yuvraj");
        mt1.start();
        mt2.start();
    }
}
/*
 * If very few lines of the code required synchrnization then it is not recommended to declare 
 * entire method as synchronized we have to enclose those few lines of the code by using the
 * synchronized block.
 * The main advantage of synchronized block over synchronized method is it reduces the waiting time of thread 
 * and improves the performanace of thread.
 * 
 */
 