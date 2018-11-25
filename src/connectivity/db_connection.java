/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectivity;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author bhagwati
 */
public class db_connection {
   static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
   static final String DB_URL="jdbc:mysql://localhost/criminal_fd";
   static final String USER_NAME="root";
   static final String PASSWORD="";
   public static Connection db_method(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
            return conn; 
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
   } 
}
   
