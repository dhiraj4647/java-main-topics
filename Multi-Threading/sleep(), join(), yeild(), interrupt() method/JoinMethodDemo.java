class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   
        }
    }
}
public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException{
        MyThread mt = new MyThread();
        mt.start();
        mt.join(10000);//line1//here main thread stop execution for 10 sec
        for(int i=0;i<10;i++){
            System.out.println("main Thread");   
        }
    }
}
/*
 * If thread want to wait until completing some other thread then we should go for join method.
 * if thread t1 wants to wait until completing t2 then t1 has to call t2.join() if t1 executes the
 * t2.join() then immediately t1 will be entered into waiting state until t2 completes, once the t2 completes
 * then t1 can continue its execution.
 * 
 * Live example:
 * weding cards printing thread has to wait until venue fixing thread t1 hence t2 has to call t1.join
 * wedding cards districution thread t3 has wait until wedding cards printing thread t2 hence t3 has to call
 * t2.join()
 * 
 * 1)public final void join() throws InterruptedException{}
 * 2)public final void join(long millisec) throws InterruptedException{}
 * 3)public final void join(long milliesec, int nanosec) throws InterruptedException{}
 * 
 * Note:Every join method throws interruptedException which is chcked exception hence we have to 
 * handled either using the try catch or throws kw.
 * 
 * here if we commentt the line 1 then both thread executes simulteneouslyy and we cant expect the 
 * exact output
 * here if we comment the line 1 then main thread wait for 10 sec then it will executes.
 * outut:
 * child Thread
child Thread
child Thread
child Thread
child Thread
main Thread
main Thread
main Thread
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
 * 
 * 
 */