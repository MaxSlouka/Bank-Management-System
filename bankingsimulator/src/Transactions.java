import javax.swing.*;
import java.awt.*;

public class Transactions extends JFrame {

    Transactions(){

        setLayout(null);

        ImageIcon i1 = new ImageIcon("bankingsimulator\\src\\icons\\atm.jpg");
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        JButton deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        image.add(deposit);

        JButton withdrawal = new JButton("Cash Withdrawal");
        withdrawal.setBounds(355, 415, 150, 30);
        image.add(withdrawal);

        JButton fastCash  = new JButton("Fast Cash");
        fastCash.setBounds(170, 450, 150, 30);
        image.add(fastCash);

        JButton ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150, 30);
        image.add(ministatement);

        JButton  pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        image.add(pinchange);

        JButton  balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355, 485, 150, 30);
        image.add(balanceenquiry);

        JButton  exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        image.add(exit);


        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Transactions();
    }
}
