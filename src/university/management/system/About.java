
package university.management.system;

import javax.swing.*;
import java.awt.*;
public class About extends JFrame{
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
        
        JLabel name = new JLabel("Developed By: Ch.Kedhar Kiran");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel branch = new JLabel("Branch: Computer Science and Engineering");
        branch.setBounds(70, 275, 600, 40);
        branch.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(branch);
        
        JLabel rollno = new JLabel("Roll number: 2002059");
        rollno.setBounds(70, 330, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        JLabel regno = new JLabel("Reg. number: 2001287085");
        regno.setBounds(70, 380, 550, 40);
        regno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(regno);
        
        JLabel phno = new JLabel("Phone number: +917093823467");
        phno.setBounds(70, 420, 550, 40);
        phno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(phno);
        
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
    public static void main(String[] args){
        new About();
    }
}
