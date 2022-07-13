class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child Thread");
            Thread.yield();//Line1
        }
    }
}
public class YeildMethodDemo {
    public static void main(String [] args){
        MyThread mt = new MyThread();
        mt.start();
        for(int i=0;i<10;i++){
            System.out.println("main Thread");
            
        }

    }
}
/*
 * yeild method causes:
 * 1)In above program, if we are commenting the line 1 then both threads will executed simulteneously
 * abd we cant expect which thread can complete first.
 * 2)if we are not commenting the line 1 then child thread always called yeild method becoz of that
 * main thread will get chance more number of times and the chance of completing the main thread first is high.
 * 3)some platforms wont provide the proper support for yeild method
 * 4)It causes the current execution thread to give the chance to other thread. 
 * 
 * 
 * main Thread
main Thread 
main Thread 
child Thread
main Thread 
main Thread 
main Thread 
main Thread
main Thread
main Thread
main Thread
child Thread
child Thread
child Thread
child Thread
child Thread
child Thread
child Thread
child Thread
child Thread
 */
