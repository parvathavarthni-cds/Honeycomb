package libraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class database {
	public String db_url="jdbc:mysql://localhost:3306/apl_engine";
	public String username="root";
	public String password= "letmein";
//	public String db_url = "jdbc:mysql://ooerl0bnyqlsr7.cmdpvgtcehhh.ap-southeast-2.rds.amazonaws.com:3306/orderpaddb";
//	public String username = "orderpad-qa";
//	public String password = "2E6533f5435Qc4C";
	public static String resetpassword_token;
		
	
	public WebDriver fetch_data(WebDriver driver,String query) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
		{
			System.out.println("DB Connected");
			Class.forName("com.mysql.jdbc.Driver").newInstance(); //Load the JDBC driver
			System.out.println("DB Connected");
			Connection con = DriverManager.getConnection(db_url,username, password);
			System.out.println("credentials passed");
			Statement stmt = con.createStatement();	//Create Statement Object
			System.out.println("object created");
			int rs= stmt.executeUpdate(query);	// Execute the SQL Query. Store results in ResultSet
//			while (rs.next()){
//        		 resetpassword_token = rs.getString(1);								        					                               
//                System. out.println("reset password token is" +resetpassword_token);		
//        }		
			return driver;
		}
		public WebDriver update_data(WebDriver driver,String query) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
		{
//			if(resetpassword_token!=null)
//			{
				driver=fetch_data(driver,query);
//			}
			return driver;
		}

}