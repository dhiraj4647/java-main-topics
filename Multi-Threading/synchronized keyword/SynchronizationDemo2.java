//case2
class Display{
    public synchronized void wish(String name){
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
public class SynchronizationDemo2 {
    public static void main(String [] args){
        Display d1 = new Display();
        Display d2 = new Display();

        MyThread mt1 = new MyThread(d1, "Dhoni");
        MyThread mt2 = new MyThread(d2, "Yuvraj");
        mt1.start();
        mt2.start();
    }
}
/*
 * Eventhough the wish method is synchronized we will get the iregular output becoz thrads are operating on 
 * different java objects.
 * conclusion if the multiple threads are operating on same java objects then synchronization is required .
 * if multiple threads are operating are operating on multiple java objects then synchronization is not required.
 * 
 * output: is irregular output.
 */