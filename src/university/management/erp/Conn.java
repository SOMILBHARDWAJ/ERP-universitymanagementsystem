
package university.management.erp;

import java.sql.*;

public class Conn {
    
    Connection con;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "somil1234");
            s = con.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}