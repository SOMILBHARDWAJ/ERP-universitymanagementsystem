
package university.management.erp;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class UniversityManagementERP extends JFrame implements Runnable{
    Thread t ; 
    UniversityManagementERP(){
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/maincolphoto.jpg"));
        Image l2 = I1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
      ImageIcon I2 = new ImageIcon(l2);
      JLabel f = new JLabel(I2);// for wrtiting on frmae we use this
      add(f);
      t= new Thread(this);
      t.start();
      
      
      
         setVisible(true);
         for(int i =0;i<600;i++)
         {
             setSize(i,i-100);
              setLocation(i-230,i-400);
         }
        
      
    }
   
    public void run(){
        try {
            Thread.sleep(5000);
            setVisible(false);
            new login();
        } catch (InterruptedException ex) {
            
        }
        
    }

    
    public static void main(String[] args) {
        new UniversityManagementERP();
    }
    
}
