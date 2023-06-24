import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class controller {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice","root","abc123");
ResultSet rs=null;
PreparedStatement stmt=con.prepareStatement("SELECT*FROM pratice.pra WHERE roll <= 1000");
rs=stmt.executeQuery();
while(rs.next()){
	
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	
}
		
		
	}

}
