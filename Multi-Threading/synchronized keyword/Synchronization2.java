class PrintMessage{
	public synchronized void printMessage(String msg){
		System.out.print("["+msg);
		System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("]");
	}
	
}
class PrintMessageThread implements Runnable{
	PrintMessage pm ;
	String msg ;
	Thread th ;
	public PrintMessageThread(PrintMessage pm , String s){
		this.pm = pm;
		this.msg = s;
		th = new Thread(this);
		th.start();
	}
	public void run(){
		pm.printMessage(msg);
		
	}
}
class Test3 {
	public static void main(String[] args){
		PrintMessage pm = new PrintMessage();
		PrintMessageThread obj = new PrintMessageThread(pm, "dhiraj");
		PrintMessageThread obj1 = new PrintMessageThread(pm,"suraj");
		PrintMessageThread obj3 = new PrintMessageThread(pm, "gardi");
    }
}