
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About() {

        setSize(730, 650);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);

        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(20, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        JLabel name = new JLabel("Group Members");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);

        JLabel regno = new JLabel("1.CH. Kedhar Kiran, Regd.No:- 2001287085");
        regno.setBounds(70, 270, 900, 40);
        regno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(regno);

        JLabel phno = new JLabel("2.P.Vignesh, Regd.No:- 2001287103");
        phno.setBounds(70, 320, 700, 40);
        phno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(phno);

        JLabel branch = new JLabel("Branch: Computer Science & Engineering");
        branch.setBounds(70, 370, 950, 40);
        branch.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(branch);

        JLabel contact = new JLabel("Contact: chkedharkiran@gmail.com");
        contact.setBounds(70, 480, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);

        JLabel Github = new JLabel("Github: https://github.com/ChKedharKiran709");
        Github.setBounds(70, 510, 550, 40);
        Github.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(Github);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new About();
    }
}
