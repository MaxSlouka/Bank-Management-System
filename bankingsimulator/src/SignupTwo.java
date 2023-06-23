import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class SignupTwo extends JFrame implements ActionListener {

    static Long formnum;
    String[] occupationValues, valEducation, valCategory, valReligion;
    JComboBox religionComboBox, categoryComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    ButtonGroup seniorButtonGroup, existingButtonGroup;
    JTextField panTextField, aadharTexField;
    JButton next;
    JRadioButton yes, no, yes1, no1;

    JLabel additionalDetails, religion, category, income, education,
            qualification, occupation, pan, aadhar, state, pincode;

    SignupTwo(Long formnum) {
        this.formnum = formnum;
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

        valReligion = new String[]{"-- choose below --", "Atheist", "Hindu", "Muslim", "Sikh", "Christian", "Other"};

        religionComboBox = new JComboBox(valReligion);
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

        valCategory = new String[]{"-- choose below --", "General", "OBC", "SC", "ST", "Other"};
        categoryComboBox = new JComboBox(valCategory);
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

        String[] valIncome = {"-- choose below --", "None", "< 1,500$", "< 3,000$", "< 6,000$", "Upto 10,000$", "Upto 20,000$", "Upto 50,000$", "Upto 100,000$"};

        incomeComboBox = new JComboBox(valIncome);
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

        valEducation = new String[]{"-- choose below --", "Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        educationComboBox = new JComboBox(valEducation);
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

        occupationValues = new String[]{"-- choose below --", "Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationComboBox = new JComboBox(occupationValues);
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        occupationComboBox.setForeground(Color.BLACK);
        setLayout(null);
        add(occupationComboBox);

        pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        setLayout(null);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        setLayout(null);
        add(panTextField);

        aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        setLayout(null);
        add(aadhar);

        aadharTexField = new JTextField();
        aadharTexField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTexField.setBounds(300, 490, 400, 30);
        setLayout(null);
        add(aadharTexField);

        state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        setLayout(null);
        add(state);

        yes = new JRadioButton("Yes");
        yes.setFont(new Font("Raleway", Font.BOLD, 14));
        yes.setBackground(Color.WHITE);
        yes.setBounds(300, 540, 100, 30);
        setLayout(null);
        add(yes);

        no = new JRadioButton("No");
        no.setFont(new Font("Raleway", Font.BOLD, 14));
        no.setBackground(Color.WHITE);
        no.setBounds(450, 540, 100, 30);
        setLayout(null);
        add(no);

        seniorButtonGroup = new ButtonGroup();
        seniorButtonGroup.add(yes);
        seniorButtonGroup.add(no);

        pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        setLayout(null);
        add(pincode);

        yes1 = new JRadioButton("Yes");
        yes1.setFont(new Font("Raleway", Font.BOLD, 14));
        yes1.setBackground(Color.WHITE);
        yes1.setBounds(300, 590, 100, 30);
        setLayout(null);
        add(yes1);

        no1 = new JRadioButton("No");
        no1.setFont(new Font("Raleway", Font.BOLD, 14));
        no1.setBackground(Color.WHITE);
        no1.setBounds(450, 590, 100, 30);
        setLayout(null);
        add(no1);

        existingButtonGroup = new ButtonGroup();
        existingButtonGroup.add(yes1);
        existingButtonGroup.add(no1);

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
        new SignupTwo(formnum);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) religionComboBox.getSelectedItem();
        String category = (String) categoryComboBox.getSelectedItem();
        String income = (String) incomeComboBox.getSelectedItem();
        String education = (String) educationComboBox.getSelectedItem();
        String occupation = (String) occupationComboBox.getSelectedItem();
        String senior = null;
        if (yes.isSelected()) {
            senior = "Yes";
        } else if (no.isSelected()) {
            senior = "No";
        }
        String existing = null;
        if (yes1.isSelected()) {
            existing = "Yes";
        } else if (no1.isSelected()) {
            existing = "No";
        }

        String pan = panTextField.getText();
        String aadhar = aadharTexField.getText();


        try {

            Conn c = new Conn();
            String query = "insert into signupTwo values('" + formnum + "','" + religion + "', '" + category + "', '" + income + "','" + education + "','" + occupation + "', '" + pan + "','" + aadhar + "', '" + senior + "', '" + existing + "')";
            c.s.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(
                    "Error: " + ex
            );
        }
    }

}