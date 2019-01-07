package beans;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student" ,schema="david")
public class Student {

	
	@Id
	@Column(name="sid")
	private int id;
	
	@Column(name="sname")
	private String name;
	

	
	@Column(name="semail")
	private String email;
	
	@Column(name="address")
	private String adddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	
	
	

}