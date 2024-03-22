import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class check_book 
{
    static int customer_id = 0;
    
    public check_book(int x)
    {
        customer_id = x;
    }
    
    public check_book() 
    {
        int flag = 0;
        
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select check_book from account where customer_id = ?");
            pst.setInt(1, customer_id);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                if(rs.getInt("check_book")==0)
                {
                    flag = 1;
                    JOptionPane.showMessageDialog(null, "Request submitted for checkbook");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Already submitted request for checkbook");
                }
            }
            if(flag == 1)
            {
                pst = con.prepareStatement("update account set check_book = 1 where customer_id = ?");
                pst.setInt(1, customer_id);
                pst.executeUpdate();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex);
        }
    }
}
