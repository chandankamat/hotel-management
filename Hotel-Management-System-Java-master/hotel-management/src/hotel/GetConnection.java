package hotel;


import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	
	Connection connect;
	
	@SuppressWarnings("unused")
	public Connection getConnection()
	{   
	
		String url,user,pwd;
		String url1 = "jdbc:mysql://localhost:3306/renaissance";
		String user1 = "root";
		String pwd1 = "kumar123";
		
		
		
	
		try {
		
			 connect =DriverManager.getConnection(url1, user1, pwd1);
           
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connect;
		
	}

}
