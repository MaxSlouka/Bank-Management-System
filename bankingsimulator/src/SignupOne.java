import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignupOne extends JFrame {

    SignupOne() {
        setTitle("Signup");

        Random random = new Random();
        long formnum = Math.abs(random.nextLong() % 9000L) + 1000L;


        JLabel formno = new JLabel("Application Form no.:" + formnum);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        setLayout(null);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        setLayout(null);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        setLayout(null);
        add(name);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
