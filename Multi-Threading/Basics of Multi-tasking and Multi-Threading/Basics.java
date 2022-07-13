/*
Multitasking: executing multiple task concurrently is multi tasking.
1)Process based multi tasking: Here each task is executed as seprate process.
2)Thread based multi tasking: here each independent task is executed at one single process.
The main goal of the both tasking is to improve performance by reducing the response time.

Multithreading:the process of creating the multiple threads in JSA for
executing multiple tasks concurrently to finish their execution in short time by using 
processor ideal time effectively.
->two ways to call custom Thread in java:
1)implementing the Runnable interface
2)Extending the Thread class.

1) public void start() throws IllegalThreadStateException (unchecked exception)
	-> it is used for causing custom thread to start 
	-> we are requsting JVM to start custom thread of execution
	-> start() method does not call run() method implicitly
	-> run() is called by JVM
	-> when we call start() method, 
		-> JVM creates thread of execution for this thread object
		-> and calls run() method by this thread object
		-> loads its logic this thread of execution and 
		-> runs logic given in this run() method concrrently with other threads

	-> Rule: we can not call start() method multiple times on same thread object
		it will throw an excetion IllegalThreadStateException

2) public void run()
	-> it used for supplying logic to execute in custom thread of execution
	-> it is the initialial point of execution of every custom thread
	-> it is originally declared in Runnable interface
	-> it is implemented in Thread class for calling run() from the passed Runnable implementation class
	-> now we can override run() method either from Thread class or from Runnable interface for suppling logic to execute in custom thread

	-> in project, it is recommended to implement run() method from Runnable interface,  because 
		1) we can extend from other class (multiple inheritance is supported) 
		2) we can clearly separate thread creation logic and implementaion logic 
		3) there by we can achieve parallel development and
		4) thread creation logic is reusable

	-> Rule: From run() method we can not throw any checked exception
		because it is an overriding method, we can not add throws checked exception.
		- In run() method we must catch all checked exception, else we will get compile time error.
		- From run() method we can throw unchecked exceptions.
		- If we need to throw a checked exception from run() method,
		  we must implement exception chaining by using unchecked exception RuntimeException	

3) public static void sleep(long mills) throws InterruptedException (checked excpetion)
4) public static void sleep(long mills, int naos) throws InterruptedException (checked excpetion)

	- it is used for pausing currently running thread for a given period of time independent of other threads
	- when we call sleep() method this CRT is sent to TIMED_WAITING state.
	- after given time complete, this thread comes to R-t-R state and wait for its next turn

	- Rule: we must handle InterruptedException, becauese it is checked excpetion

Run() method is present in Thread class which is implementing from Runnable interface
and run() method is implemented in Thread class without any logic so user must
develope and override it in subclass.
-We should call start() method on Thread class object to create thread for execution
in java stack frame. 
sleep() method:-
public static native void sleep(long millis) throws InterruptedException
public static native void sleep(long millis, int nanos) throws InterruptedException
values of millis should not be negative and the values of nanos should be between 
0-999999 else IllegalArgumentException  
*/
/*
class MyThread extends Thread{
    public void run(){
     	System.out.println("run");
	}
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();
	}
}	
here when we create the MyThread object Thread class object is also created internally
and using that we are calling start method which creates the java stack area for custom thread
and its execution starts by executing run method.
	*/

class MyRunnable implements Runnable{
    public void run(){
     	System.out.println("run");
	}
    public static void main(String[] args){
        
		MyRunnable mt = new MyRunnable();
        Thread t = new Thread(mt);
		t.start();
	} 	
		
}
/*
when we create the subclass object then Thread object will not created becoz it is not
a subclass of Thread class so we are creating explicitly Thread class object using the 
Runnable parameter constructor and calling the start method using that Thread object.
start method which creates the java stack area for custom thread
and its execution starts by executing run method.
*/	