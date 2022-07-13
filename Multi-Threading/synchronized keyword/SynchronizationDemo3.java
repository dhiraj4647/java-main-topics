//case3
class Display{
    public static synchronized void wish(String name){
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
public class SynchronizationDemo3 {
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
 * Every class in java has a unique lock which is also knows as class level lock.
 * If a thread wants to execute the static synchronized method then thread required
 * class level lock once the thread got class level lockk then it is allowed to execute 
 * any static synchronized method of that class
 * Once the method execution completes automatically thread releases the lock. 
 * 
 * output:-
Good Morning:Dhoni
Good Morning:Dhoni
Good Morning:Dhoni
Good Morning:Dhoni
Good Morning:Dhoni
Good Morning:Yuvraj
Good Morning:Yuvraj
Good Morning:Yuvraj
Good Morning:Yuvraj
Good Morning:Yuvraj
 */
