package beans;

public class Admin extends Employee{
	
	private String branchname;

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, String email, int salary,String branchname) {
		super(id, name, email, salary);
		this.branchname = branchname;
		// TODO Auto-generated constructor stub
	}
	

}