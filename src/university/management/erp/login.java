package university.management.erp;

import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener {
JButton login,cancel;
 JTextField tfusern,tfpass;
    login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel usern = new JLabel("username");
        usern.setBounds(40, 20, 100, 40);
        add(usern);
        //for leter
        tfusern = new JTextField();
        tfusern.setBounds(150, 25, 150, 30);
        add(tfusern);
        //for textfeild
        JLabel pass = new JLabel("password");
        pass.setBounds(40, 70, 100, 40);
        add(pass);
        //
       tfpass = new JPasswordField();
        tfpass.setBounds(150, 70, 150, 30);
        add(tfpass);
        //for passwordetxt feild doted
        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);// 
        login.addActionListener(this);
        login.setFont(new Font("tahoma", Font.BOLD, 13));
        add(login);
        // fro button with
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
            cancel.addActionListener(this);
        cancel.setFont(new Font("tahoma", Font.BOLD, 13));
        add(cancel);
        //
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image l2 = I1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon I2 = new ImageIcon(l2);
        JLabel f = new JLabel(I2);
        f.setBounds(350, 5, 200, 200);
        add(f);
        //for icon 

        setSize(550, 250);
        setLocation(420, 250);
        setVisible(true);

    }
    

  

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==login){
           
            String uname = tfusern.getText();
            String pass = tfpass.getText();
            String query = "select * from login where username='"+uname+"' and password='"+pass+"'";
            Conn c = new Conn();
            try{
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Project();
            }
            else{
                JOptionPane.showMessageDialog(null,"invalid username or password");
                setVisible(false);
            }
            c.s.close();
            c.con.close();
            }
            catch(Exception er){
                er.printStackTrace();
            }
            
        }
        else if(e.getSource()==cancel){
            setVisible(false);
        }
        }
    
      public static void main(String[] args) {
        new login();
    }
}
