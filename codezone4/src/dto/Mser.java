package dto;



public class Mser {


	private String ProjectDescription;
	private String Status;
	
	 
	public Mser()
	{
	 
	}
	 
	public Mser( String ProjectDescription, String Status)
	{
	super();
	
	this.ProjectDescription = ProjectDescription;
	this.Status = Status;
	
	}
	 

	 
	public String getProjectDescription()
	{
	return ProjectDescription;
	}
	 
	public void setProjectDescription(String ProjectDescription)
	{
	this.ProjectDescription = ProjectDescription;
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
	return "Mser [ project=" + ProjectDescription + ", status=" + Status+ "]";
	}
	 
	
}
