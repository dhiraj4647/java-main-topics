/*
Controlling Thread Execution:
sleep() method is used to stop/pause the execution for particular time
join() method is used to pause thread execution until thread is executed.
executing threads sequentially using sequential keyword.
==>join has three method in Thread class:
public final void join() throws InterruptedException
public final synchronized void join(long millies) throws InterruptedException
public final synchronized void join(long millies, int nanos) throws InterruptedException
-No arg join method pauses the thread until completion of other thread means 
if other thread is blocked forever then this threda execution is also blocked forever.
-whereas parameteized join method does not block thread until completion of other
thread execution. its execution is resumed after completion of given time.
==>sleep(long) method pauses thread execution for particular time completely
but join(long) method paused the thread execution depend on other thread execution
for given period of time. if other thread execution is completed before the
given time then it resumes the current thread even time is not finished. 
*/
class JoinClassDemo extends Thread implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+":"+i);
			if(i==5 && getName().equals("suraj")){
				try{Thread.sleep(500);}
				catch(InterruptedException ie){ie.printStackTrace();}
			}
		}
	}
	public static void main(String[] args) throws InterruptedException{
		System.out.println("main is started");
		
		JoinClassDemo th1 = new JoinClassDemo();
		th1.setName("dhiraj");
		th1.start();
        JoinClassDemo th2 = new JoinClassDemo();
        th2.setName("suraj");
        th2.start();
        th1.join(100);
        th2.join(100);
     	System.out.println("main is finished");
	}
}	
			