import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){

        setTitle("Banking simulator");
        ImageIcon icon = new ImageIcon("bankingsimulator\\src\\logo.jpg");
        Image i2 = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public static void main(String[] args) {
        new Login();
    }
}
