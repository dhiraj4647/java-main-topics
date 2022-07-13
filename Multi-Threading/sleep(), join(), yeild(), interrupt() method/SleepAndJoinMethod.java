/*
 -Pausing the thread execution for given period of time is sleep method.
 -pausing the thread execution until other thread execution is completed using join method.
 public final void join() throws InteruptedException
 public final synchronized void join(long milllis) throws InteruptedException
 public final synchronized void join(long millies, int nanos) throws InteruptedException

 sleep method does not allow to run thread until given time is completed.
 join method pauses the thread execution dependent on other thread for given period of time.
 if other thread is execution completed before the time then it will resumed the current thread immediately.
*/
class Demo extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+"-"+i);
			if(getName() == "child1" && i==5){
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
    }
	public static void main(String[] args) throws InterruptedException{
		System.out.println("main is started");
		Demo d1 = new Demo();
		d1.setName("child1");
		d1.start();

		Demo d2 = new Demo();
		d2.setName("child2");
		d2.start();
		d1.join();d2.join();

		
		
		System.out.println("main is completed");


	}
} 