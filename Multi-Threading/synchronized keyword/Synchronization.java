/*
Sysnchonization:
*/
class Add{
	int x, y;
	synchronized void add (int x, int y){
		this.x=x;
		this.y=y;
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		int res = this.x +this.y;
	    System.out.println("Thread result:"+Thread.currentThread().getName()+" is "+res);
		
	}
}
class Thread1 extends Thread{
	Add a ;
	Thread1(Add a){this.a=a;}
	public void run(){
		a.add(40,20);
		
	}
}
class Thread2 extends Thread{
	Add a ;
	Thread2(Add a){this.a=a;}
	public void run(){
		a.add(20,2);
	}
}
class Test {
	static public void main(String[] args){
		Add a = new Add();
		Add a1 = new Add();
		new Thread1(a).start();
		new Thread2(a).start();
	}
}