//case2 :class level lock
class Display{
    public  void wish(String name){
        ;;;;;;;;;//1 laik lines of code
        synchronized(Display.class){//to get the class level lock
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

public class SynchronizedBlock2 {
    public static void main(String [] args){
        Display d1 = new Display();
        Display d2 = new Display();

        MyThread mt1 = new MyThread(d1, "Dhoni");
        MyThread mt2 = new MyThread(d2, "Yuvraj");
        mt1.start();
        mt2.start();
    }
}