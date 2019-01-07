package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentityGenerator;



public class KeyGen extends IdentityGenerator {

	public Serializable generate(SessionImplementor s, Object obj)
	{
		String name="ICICI";
		try{
			Connection con=s.connection();
		
		Statement st= con.createStatement();
		String sql="select icici_seq.nextval from dual";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next())
		{
			name=name+rs.getInt(1);
			
		}
		}catch(Exception e){}
		return name;
	}
	
	
	
}
