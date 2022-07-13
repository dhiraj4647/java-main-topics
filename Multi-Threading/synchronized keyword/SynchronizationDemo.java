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
public class SynchronizationDemo {
    public static void main(String [] args){
        Display d = new Display();
        MyThread mt1 = new MyThread(d, "Dhoni");
        MyThread mt2 = new MyThread(d, "Yuvraj");
        mt1.start();
        mt2.start();
    }
}
/*
 * 1)synchronized is the modiifier only applicable only for methods and blocks but not 
 * for classes and variables
 * 2)if multiple threads are trying to operate simulteneously on the same java object then
 * there may be chance of data inconsistancy problem to overcome this problem 
 * we should go for synchronized keyword.
 * 3)if a method or block is declared as synchronized then at a time only one thread 
 * is allowed to execute that method or block on the given objects so that data inconsistancy 
 * problem will be resolved.
 * 4)The main advantage of synchronized kw is we can resolve the data inconsistancy problem
 * but the main disadvantage of syncronized kw is it increases the waiting time of threads and creates
 * performanace problems, hence if there is no specific reqiurement then not recommended to 
 * use the synchronized kw.
 * 5)Internally synchronization concept is implemented by using the lock, every object in java
 * has a unique lock whenever we are using the synchornized kw then only lock concept comes into picture
 * 6)if a thread wants to execute the synchronized method on the given object first it has to get 
 * lock of that object once the thread got the lock then it is allowed to execute any synchronized 
 * method on that object. once the method execution completes automatically thread releases the lock 
 * 7)Acquiring and the releasing the lock internally takes care by the jvm and the programmer not responsible
 * for this activity.
 * 
 * 8)While thread executing the synchronized method on the given object the remaining threads are not allowed to execute 
 * any synchonized method simulteneouly on the same object but remaining threads are allowed to execute the non-synchronized 
 * method simulteneously.
 * 9)lock concept is implemented based on the object but not based on the method. 
 * 
 * 10) Whereever we are performing the update operation like add, remove, delete, replace ie
 * where state of object is changing then this should be synchornized area.
 * 
 * 11)Wherever object state won't be chnaged like read operation used the non synchronized area.
 * 
 * In the above program:
 * If we not declare the wish() method as synchronized then both threads will be executed
 * simulteneously and hence we will get irregular output.
 * output:
 * Good Morning:Good Morning:Yuvraj
   Good Morning:Dhoni
   Good Morning:Yuvraj.....
 * if we declare the wish() method as synchronized then at a time only one thread is allowed to
 * execute wish method and the given display object hence we will get the regular output.
Output:-
Good Morning:Yuvraj
Good Morning:Yuvraj
Good Morning:Yuvraj
Good Morning:Yuvraj
Good Morning:Yuvraj
Good Morning:Dhoni
Good Morning:Dhoni
Good Morning:Dhoni
Good Morning:Dhoni
Good Morning:Dhoni  
 */