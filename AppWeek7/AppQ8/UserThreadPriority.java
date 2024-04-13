package AppWeek7.AppQ8;
import java.util.Scanner;

class UserThreadPriority extends Thread {
    private String k;
    private char c;
    public UserThreadPriority(String k, char c) {
        this.k = k;
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println("Thread " + getName() + ": k = " + k + ", c = " + c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String k = scanner.nextLine();
        System.out.print("Enter a Character: ");
        char c = scanner.next().charAt(0);
        UserThreadPriority threadobj1 = new UserThreadPriority(k, c);
        UserThreadPriority threadobj2 = new UserThreadPriority(k, c);
        threadobj1.setName("ThreadA");
        threadobj2.setName("ThreadB"); threadobj1.start();
        threadobj2.start(); scanner.close();
    }
}