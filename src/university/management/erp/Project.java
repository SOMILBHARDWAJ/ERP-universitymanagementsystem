package university.management.erp;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1500, 859);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/Third.jpg"));
        Image l2 = I1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon I2 = new ImageIcon(l2);
        JLabel f = new JLabel(I2);// for wrtiting on frmae we use this
        add(f);

        //image done now menu work
        JMenuBar jmb = new JMenuBar();

        //
        JMenu newinfo = new JMenu("New Information");
        newinfo.setForeground(Color.black);
        jmb.add(newinfo);

        // menu main now there items
        JMenuItem facultyinfo = new JMenuItem("new faculty information");
        facultyinfo.setForeground(Color.blue);
        facultyinfo.addActionListener(this);
        newinfo.add(facultyinfo);
        JMenuItem studentinfo = new JMenuItem("new student information");
        studentinfo.setForeground(Color.blue);
        studentinfo.addActionListener(this);
        newinfo.add(studentinfo);

        // menu items added
        //next menu view 
        JMenu viewinfo = new JMenu("view Information");
        viewinfo.setForeground(Color.blue);
        jmb.add(viewinfo);
        // menu main now there items
        JMenuItem vfacultyinfo = new JMenuItem("view faculty information");
        vfacultyinfo.addActionListener(this);
        vfacultyinfo.setForeground(Color.blue);
        viewinfo.add(vfacultyinfo);
        JMenuItem vstudentinfo = new JMenuItem("view student information");
        vstudentinfo.setForeground(Color.blue);
        vstudentinfo.addActionListener(this);
        viewinfo.add(vstudentinfo);
        // leave

        JMenu leaveapply = new JMenu("leave apply");
        leaveapply.setForeground(Color.black);
        jmb.add(leaveapply);
        // menu main now there items
        JMenuItem facultyleaveap = new JMenuItem("faculty leaveapply");
        facultyleaveap.addActionListener(this);
        facultyleaveap.setForeground(Color.blue);
        leaveapply.add(facultyleaveap);
        JMenuItem studleave = new JMenuItem("student leaveapply");
        studleave.addActionListener(this);
        studleave.setForeground(Color.blue);
        leaveapply.add(studleave);

        // leave details 
        JMenu leavedet = new JMenu("leave details");
        leavedet.setForeground(Color.blue);
        jmb.add(leavedet);
        // menu main now there items
        JMenuItem facultyleavedet = new JMenuItem("faculty leave details");
        facultyleavedet.setForeground(Color.blue);
        facultyleavedet.addActionListener(this);
        leavedet.add(facultyleavedet);
        JMenuItem studleavedet = new JMenuItem("student leave  details");
        studleavedet.setForeground(Color.blue);
        studleavedet.addActionListener(this);
        leavedet.add(studleavedet);

        // exams
        JMenu exams = new JMenu("exams information");
        exams.setForeground(Color.black);
        jmb.add(exams);
        // menu main now there items
        JMenuItem examinationres = new JMenuItem("examination result");
        examinationres.setForeground(Color.blue);
        examinationres.addActionListener(this);
        exams.add(examinationres);
        JMenuItem entermarks = new JMenuItem("enter marks");
        entermarks.addActionListener(this);
        entermarks.setForeground(Color.blue);
        exams.add(entermarks);
        // update 

        JMenu update = new JMenu("update information");
        update.setForeground(Color.blue);
        jmb.add(update);
        // menu main now there items
        JMenuItem updatefaculty = new JMenuItem("faculty update");
        updatefaculty.setForeground(Color.blue);
        updatefaculty.addActionListener(this);
        update.add(updatefaculty);
        JMenuItem updatestudent = new JMenuItem("student update");
        updatestudent.setForeground(Color.blue);
        updatestudent.addActionListener(this);
        update.add(updatestudent);

        //fees
        JMenu fee = new JMenu("fees details");
        fee.setForeground(Color.black);
        jmb.add(fee);
        // menu main now there items
        JMenuItem feestruct = new JMenuItem("Fee Structure");
        feestruct.addActionListener(this);
        feestruct.setForeground(Color.blue);
        fee.add(feestruct);
        JMenuItem feeform = new JMenuItem("fee form");
        feeform.addActionListener(this);
        feeform.setForeground(Color.blue);
        fee.add(feeform);
        
           // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        jmb.add(about);
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        

        // utiltity
        JMenu utility = new JMenu("utility");
        utility.setForeground(Color.black);
        jmb.add(utility);
        // menu main now there items
        JMenuItem Notepad = new JMenuItem("Notepad");
        Notepad.setForeground(Color.blue);
        Notepad.addActionListener(this);
        utility.add(Notepad);
        JMenuItem calculator = new JMenuItem("calculator");
        calculator.setForeground(Color.blue);
        calculator.addActionListener(this);
        utility.add(calculator);

        //exit 
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.blue);

        jmb.add(exit);
        JMenuItem exittab = new JMenuItem("EXIT");
        exittab.setForeground(Color.black);
        exittab.addActionListener(this);
        exit.add(exittab);

        setJMenuBar(jmb);

        setVisible(true);
    }

    public static void main(String[] arg) {
        new Project();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg= e.getActionCommand();
        if(msg.equals("EXIT")){
            setVisible(false);
        }
        else if(msg.equals("calculator")){
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception ex) {
              
            }
        }
        else if(msg.equals("Notepad")){
             try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception ex) {
              
            }
        }
        else if(msg.equals("new faculty information")){
            new AddTeacher();
        }
        else if(msg.equals("new student information")){
            new AddStudent();
        }
        else if(msg.equals("view faculty information")){
           new TeacherDetails();
        }
        else if(msg.equals("view student information")){
             new StudentDetails();
        }
         else if (msg.equals("faculty leaveapply")) {
            new TeacherLeave();
        } else if (msg.equals("student leaveapply")) {
            new StudentLeave();}
         else if (msg.equals("faculty leave details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("student leave  details")) {
            new StudentLeaveDetails();
        }
         else if (msg.equals("faculty update")) {
            new UpdateTeacher();
        } else if (msg.equals("student update")) {
            new UpdateStudent();
        }
        else if (msg.equals("enter marks")) {
            new EnterMarks();
        }
        else if (msg.equals("examination result")) {
            new ExaminationDetails();
        }
        else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();

    }
        else if (msg.equals("fee form")) {
            new StudentFeeForm();

    }
    }
}
