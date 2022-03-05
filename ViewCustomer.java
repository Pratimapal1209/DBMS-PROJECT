
package tourism.inn.management.system;




import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;




public class ViewCustomer extends JFrame implements ActionListener{
    
  
    JButton  b2;
    ViewCustomer(String username){
            
            setBounds(500, 200, 850, 550);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
            
            
            
            JLabel l1 = new JLabel("Username:");
            l1.setBounds(30, 50, 150, 25);
            add(l1);
            
            JLabel l11 = new JLabel();
            l11.setBounds(220, 50, 150, 25);
            add(l11);
  
            
            
            JLabel l2 = new JLabel("ID Type: ");
            l2.setBounds(30, 90, 150, 25);
            add(l2);
            
            JLabel l12 = new JLabel();
            l12.setBounds(220, 90, 150, 25);
            add(l12);
          
          
          
            JLabel l3 = new JLabel("ID Number:");
            l3.setBounds(30, 130, 150, 25);
            add(l3);
            
            JLabel l13 = new JLabel();
            l13.setBounds(220, 130, 150, 25);
            add(l13);
            
     
            
            JLabel l4 = new JLabel("Name:");
            l4.setBounds(30, 170, 150, 25);
            add(l4);
            
            JLabel l14 = new JLabel();
            l14.setBounds(220, 170, 150, 25);
            add(l14);
            
            JLabel l5 = new JLabel("Gender:");
            l5.setBounds(30, 210, 150, 25);
            add(l5);
            
            
            JLabel l15 = new JLabel();
            l15.setBounds(220, 210, 150, 25);
            add(l15);
            
            
            
            JLabel l6 = new JLabel("Country:");
            l6.setBounds(30, 250, 150, 25);
            add(l6);
            
            
            JLabel l16 = new JLabel();
            l16.setBounds(220, 250, 150, 25);
            add(l16);
            
            
            JLabel l7 = new JLabel("Address :");
            l7.setBounds(30, 290, 150, 25);
            add(l7);
   
            
            JLabel l17 = new JLabel();
            l17.setBounds(220, 290, 150, 25);
            add(l17);

            
            
            JLabel l8 = new JLabel("Phone:");
            l8.setBounds(30, 330, 150, 25);
            add(l8);
            
            
            JLabel l18 = new JLabel();
            l18.setBounds(220, 330, 150, 25);
            add(l18);
            
            
            
            JLabel l9 = new JLabel("Email:");
            l9.setBounds(30, 370, 150, 25);
            add(l9);
   
            
            JLabel l19 = new JLabel();
            l19.setBounds(220, 370, 150, 25);
            add(l19);

            
            
            
      
        
        
        b2= new JButton("Back");
        b2.setBounds(220, 430, 100, 25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("tourism/inn/management/system/icon/vi.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400, 50, 400, 400);
        add(l10);
        
        
        try{
            
            
            Con c = new Con();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                l11.setText(rs.getString("username"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("name"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
                l12.setText(rs.getString("id_type"));
                l15.setText(rs.getString("gender"));
                
                
                
                
            }
            
        }catch(Exception e){}
        
   
    }       

    
    public void actionPerformed(ActionEvent ae) {
        
         
    if(ae.getSource() == b2) {
        this.setVisible(false);
    }
    
    }
    public static void main(String[] args){
        new ViewCustomer("").setVisible(true);
    }




}
