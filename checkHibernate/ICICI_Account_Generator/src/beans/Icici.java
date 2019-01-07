package beans;

public class Icici {

	private String cid;
	private String name;
	private String email;
	private long phone;
	
	
	
	public Icici() {
		
	}
	
	public Icici(String cid, String name, String email, long phone) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	
}
