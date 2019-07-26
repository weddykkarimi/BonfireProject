import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connection {
   //create the connection strings
    String host="jdbc:mysql://localhost:3306/bonfire";
    String user="root";
    String pass="";
    
    //declare connection object
    Connection conn;
    
    //initialize the connection object
    
    public Connection getConnection(){
        
        try{
            conn=DriverManager.getConnection(host,user,pass);
            JOptionPane.showMessageDialog(null,"Connection Successful");
            return conn;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,""+ex.getMessage());
            return null;
        }
    }     
//insert the student record
        public void insertBooking(String firstname,String lastname, String ticketsnumber, String daysofvacation, String modeoftravel){
        String q="INSERT INTO booking(firstname,lastname,ticketsnumber,daysofvacation,modeoftravel)VALUES(?,?,?,?,?)";
        
        try{
            int k=0;
        PreparedStatement st=getConnection().prepareStatement(q);
        st.setString(1,firstname);
        st.setString(2,lastname);
        st.setString(3,ticketsnumber);
        st.setString(4,daysofvacation);
        st.setString(5,modeoftravel);
        
        
        if(st.executeUpdate()>k){
            JOptionPane.showMessageDialog(null, firstname +" registered successfully");
        }
    }
    catch(SQLException x){
    JOptionPane.showMessageDialog(null,x.getMessage());
}
    }
 
           //show how reteieve can be done
            public ResultSet getbookings(){
            
                String q="SELECT *FROM booking";
                try{
                    Statement st=getConnection().createStatement();
                    ResultSet rs=st.executeQuery(q);
                    return rs;
                }
                catch(SQLException x){
                    JOptionPane.showMessageDialog(null,x.getMessage());
                    return null;
                }
                
            }
           
public void updateBooking(String firstname,String lastname,String ticketsnumber, String daysofvacation, String modeoftravel){
String q="UPDATE booking SET lastname=?,ticketsnumber=?,daysofvacation=?,modeoftravel=? WHERE firstname=?";        
                try
                {
                    int k=0;
                    PreparedStatement st=getConnection().prepareStatement(q);
        st.setString(1,lastname);
        st.setString(2,ticketsnumber);
        st.setString(3, daysofvacation);
        st.setString(4, modeoftravel);
        st.setString(5, firstname);
                     if(st.executeUpdate()>k){
                    JOptionPane.showMessageDialog(null, firstname+"  updated successfully");
                }
            }
                 catch(SQLException x){
                JOptionPane.showMessageDialog(null, x.getMessage());
        } 
            
        }
    public void deleteBooking(String firstname){
            String q="DELETE FROM booking WHERE firstname=?";
            try
            {
                int k=0;
                PreparedStatement st=getConnection().prepareStatement(q);
                st.setString(1, firstname);
                 if(st.executeUpdate()>k){
                    JOptionPane.showMessageDialog(null,firstname+"  deleted successfully");
                    
                 }
            }
            catch(SQLException x){
                JOptionPane.showMessageDialog(null, x.getMessage());
            }
            
        }
}
        





