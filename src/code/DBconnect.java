package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dilshan
 */
public class DBconnect {

public static Connection connect()
{
 Connection conn=null;

    try 
    {   
       Class.forName("com.mysqljdbc.Driver");
       System.out.println("welcome");
       conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm", "root", "");
       
     
        
    } catch (Exception e) { 
        System.out.println(e);
    }

return conn; 
}


    
}
