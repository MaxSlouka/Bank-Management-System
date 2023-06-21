import javax.swing.*;
import java.util.Random;

public class SignupOne extends JFrame{

    SignupOne(){

        Random random = new Random();
        int formnum = random.nextInt(10000);

        JLabel formno = new JLabel("Application Form no.:" + formnum);

        JFrame frame = new JFrame("Signup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850, 800);
        frame.setLocation(350, 10);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
