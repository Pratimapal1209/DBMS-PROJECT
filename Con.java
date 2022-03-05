
package tourism.inn.management.system;




import java.sql.*;


public class Con {
    Connection c;
    Statement s;
    public Con(){
        
    
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
           c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","1234");
           s = c.createStatement();
            
        }catch(Exception e){
    
    
    }
  
    }}