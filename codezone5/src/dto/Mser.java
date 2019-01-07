package dto;



public class Mser {


	private String ProjectDescription1;
	private String Status;
	
	 
	public Mser()
	{
	 
	}
	 
	public Mser( String ProjectDescription1, String Status)
	{
	super();
	
	this.ProjectDescription1 = ProjectDescription1;
	this.Status = Status;
	
	}
	 

	 
	public String getProjectDescription1()
	{
	return ProjectDescription1;
	}
	 
	public void setProjectDescription1(String ProjectDescription1)
	{
	this.ProjectDescription1 = ProjectDescription1;
	}
	 
	public String getStatus()
	{
	return Status;
	}
	 
	public void setStatus(String Status)
	{
	this.Status = Status;
	}
	 
	
	 
	@Override
	public String toString()
	{
	return "Mser [ project=" + ProjectDescription1 + ", status=" + Status+ "]";
	}
	 
	
}
