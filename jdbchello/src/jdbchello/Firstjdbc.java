package jdbchello;
import java.sql.*;
public class Firstjdbc {
	public static void main(String[] args)
	{
		try
		{
			String url="jdbc:mysql://localhost:3306/persons" ;
			String username="root";
			String password="Abhiakash@7";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from personinfo");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" :"+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
