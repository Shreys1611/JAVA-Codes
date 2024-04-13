package AppWeek9.AppQ1;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
     public MyFrame() {
        super("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
