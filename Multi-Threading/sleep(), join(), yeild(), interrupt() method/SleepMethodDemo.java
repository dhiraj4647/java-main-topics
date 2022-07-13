public class SleepMethodDemo {
    public static void main(String [] args){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
            System.out.println("child Thread"); 
        }

    }
}
/*
 * if th thread dont want to perform any operation for particulat amount
 * of time then we should go for sleep() method.
 * 
 * 1)public static native void sleep(long ms) throws InterruptedException
 * 2)public static void sleep(long ms, int nanosec)throws InterruptedException
 * 
 * We have to handle the Interrupted Exception either using try catch or by throws 
 * keyword when we are using the sleep() method.
 * 
 * 
 */
