package AppWeek7.AppQ3;

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) { 
            e.printStackTrace();
        }
        this.setName("NewThreadName");
        System.out.println("Thread name after sleep: " + this.getName());
    }
}


public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}