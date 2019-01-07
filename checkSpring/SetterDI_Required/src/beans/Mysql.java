package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

public class Mysql {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	
	@Required
	public String getDriver() {
		return driver;
	}


	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}


	@Required
	public String getUrl() {
		return url;
	}


	@Required
	public void setUrl(String url) {
		this.url = url;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void getConn() throws ClassNotFoundException
	
	{

		 Class.forName(driver);
		 try {
			Connection conn=DriverManager.getConnection(url, username, password);
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		
	}

}
