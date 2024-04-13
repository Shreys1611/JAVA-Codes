package AppWeek9.AppQ2;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    private JButton myButton;

    public MyFrame() {
        super("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        myButton = new JButton("Click me");
        myButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(myButton);
        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            JOptionPane.showMessageDialog(this, "Button clicked!");
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
