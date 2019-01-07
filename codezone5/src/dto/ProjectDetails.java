package dto;

public class ProjectDetails {

	
	private String ProjectDescription;
	private String Vam;
	private String Owner;
	 
	public ProjectDetails()
	{
	 
	}
	 
	public ProjectDetails( String ProjectDescription, String Vam, String Owner)
	{
	super();
	
	this.ProjectDescription = ProjectDescription;
	this.Vam = Vam;
	this.Owner = Owner;
	}
	 
	
	 
	public String getProjectDescription()
	{
	return ProjectDescription;
	}
	 
	public void setProjectDescription(String ProjectDescription)
	{
	this.ProjectDescription = ProjectDescription;
	}
	 
	public String getVam()
	{
	return Vam;
	}
	 
	public void setVam(String Vam)
	{
	this.Vam = Vam;
	}
	 
	public String getOwner()
	{
	return Owner;
	}
	 
	public void setOwner(String Owner)
	{
	this.Owner =Owner;
	}
	 
	@Override
	public String toString()
	{
	return "ProjectDetails [ ProjectDescription=" + ProjectDescription + ", Vam=" + Vam
	+ ", Owner=" + Owner + "]";
	}
	 
}
