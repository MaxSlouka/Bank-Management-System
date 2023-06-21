import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login() {

        setTitle("Banking simulator");

        setLayout(null);

        ImageIcon icon = new ImageIcon("bankingsimulator\\src\\logo.jpg");
        Image i2 = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel l1 = new JLabel("Welcome to ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200, 40, 400, 40);
        add(l1);

        JLabel cardno = new JLabel("Card no:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 400, 40);
        add(cardno);

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 400, 40);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);

        JButton login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);

        JButton singup = new JButton("SIGN UP");
        singup.setBounds(300, 350, 230, 30);
        singup.setBackground(Color.BLACK);
        singup.setForeground(Color.WHITE);
        add(singup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public static void main(String[] args) {
        new Login();
    }
}
