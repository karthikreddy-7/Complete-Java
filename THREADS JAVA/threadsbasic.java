public class threadsbasic {
    public static void main(String[] args) {
        mythread one = new mythread();
        mythread two = new mythread();
        myrunnable runnable = new myrunnable();
        Thread three = new Thread(runnable);
        one.start();
        two.start();
        three.start();

    }

}

// creating a thread by using Thread class:
class mythread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
        }
    }
}

// creating a thread by using runnable interface:

class myrunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
        }

    }
}