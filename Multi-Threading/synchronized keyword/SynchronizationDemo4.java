//case4
class Display {
    public synchronized void printNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public synchronized void printCharacter() {
        for (int i = 65; i < 75; i++) {
            System.out.print((char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    Display a;

    MyThread1(Display a) {
        this.a = a;
    }

    public void run() {
        a.printNumber();
    }
}

class MyThread2 extends Thread {
    Display a;

    MyThread2(Display a) {
        this.a = a;
    }

    public void run() {
        a.printCharacter();
    }
}

public class SynchronizationDemo4 {
    public static void main(String[] args) {
        Display pm = new Display();
        MyThread1 mt1 = new MyThread1(pm);
        MyThread2 mt2 = new MyThread2(pm);
        mt1.start();
        mt2.start();
    }
}
/*
 * 0123456789ABCDEFGHIJ
 */
