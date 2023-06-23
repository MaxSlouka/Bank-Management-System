import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class SignupTwo extends JFrame implements ActionListener {

    Long formnum;

    JDateChooser dobChooser;

    ButtonGroup genderGroup, maritalGroup;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, pincodeTextField, stateTextField, dobTextField;
    JButton next;
    JRadioButton otherRelationship, unmarried, married, other, female, male;

    JLabel additionalDetails, religion, category, income, education,
            qualification, occupation, pan, aadhar, state, pincode;

    SignupTwo() {
        setTitle("New Account Application Form - Page 2");


        additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        setLayout(null);
        add(additionalDetails);

        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        setLayout(null);
        add(religion);

        String[] religion = {"-- choose below --","Atheist", "Hindu", "Muslim", "Sikh", "Christian", "Other"};

        JComboBox religionComboBox = new JComboBox(religion);
        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setBackground(Color.WHITE);
        religionComboBox.setForeground(Color.BLACK);
        setLayout(null);
        add(religionComboBox);

        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        setLayout(null);
        add(category);
        String[] valCategory = {"-- choose below --","General", "OBC", "SC", "ST", "Other"};

        JComboBox categoryComboBox = new JComboBox(valCategory);
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setBackground(Color.WHITE);
        categoryComboBox.setForeground(Color.BLACK);
        setLayout(null);
        add(categoryComboBox);

        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        setLayout(null);
        add(income);

        String[] valIncome = {"-- choose below --","None", "< 1,500$", "< 3,000$", "< 6,000$", "Upto 10,000$", "Upto 20,000$", "Upto 50,000$", "Upto 100,000$"};

        JComboBox incomeComboBox = new JComboBox(valIncome);
        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeComboBox.setBounds(300, 240, 400, 30);
        incomeComboBox.setBackground(Color.WHITE);
        incomeComboBox.setForeground(Color.BLACK);
        setLayout(null);
        add(incomeComboBox);

        education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        setLayout(null);
        add(education);

        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 320, 200, 30);
        setLayout(null);
        add(qualification);

        String[] valEducation = {"-- choose below --","Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        JComboBox educationComboBox = new JComboBox(valEducation);
        educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        educationComboBox.setBounds(300, 320, 400, 30);
        educationComboBox.setBackground(Color.WHITE);
        educationComboBox.setForeground(Color.BLACK);
        setLayout(null);
        add(educationComboBox);

        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        setLayout(null);
        add(occupation);

        String[] occupationValues = {"-- choose below --","Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        JComboBox occupationComboBox = new JComboBox(occupationValues);
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        occupationComboBox.setForeground(Color.BLACK);
        setLayout(null);
        add(occupationComboBox);

        maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(otherRelationship);

        pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        setLayout(null);
        add(pan);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        setLayout(null);
        add(addressTextField);

        aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        setLayout(null);
        add(aadhar);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        setLayout(null);
        add(cityTextField);

        state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        setLayout(null);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        setLayout(null);
        add(stateTextField);

        pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        setLayout(null);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        setLayout(null);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(600, 640, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

    }

    public static void main(String[] args) {
        new SignupTwo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fname = fnameTextField.getText();
        String name = nameTextField.getText();
        java.util.Date dob = dobChooser.getDate();
        ;
        String formno = "" + formnum;
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (otherRelationship.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formnum + "','" + name + "', '" + fname + "', '" + dob + "','" + gender + "','" + email + "', '" + marital + "','" + address + "', '" + city + "', '" + state + "', '" + pincode + "')";
                c.s.executeUpdate(query);
            }
        } catch (Exception ex) {
            System.out.println(
                    "Error: " + ex
            );
        }
    }

}