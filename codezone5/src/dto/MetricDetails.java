package dto;

public class MetricDetails {

	private int Phase;
	private String Resources;
	private String Comments;
	private String Cost;
	private String Risk;
	private String Quality;
	private String Status;
	
	public MetricDetails()
	{
	 
	}
	 
	public MetricDetails(int Phase,String Resources,String Comments,String Cost,String Risk,String Quality,String Status)
	{
	super();
	
	this.Phase = Phase;
	this.Resources = Resources;
	this.Comments = Comments;
	this.Cost = Cost;
	this.Risk = Risk;
	this.Quality = Quality;
	this.Status = Status;



	}
	 
	public int getPhase()
	{
	return Phase;
	}
	 
	public void setPhase(int Phase)
	{
	this.Phase = Phase;
	}
	 
	 
	public String getResources()
	{
	return Resources;
	}
	 
	public void setResources(String Resources)
	{
	this.Resources = Resources;
	}
	 
	public String getComments()
	{
	return Comments;
	}
	 
	public void setComments(String Comments)
	{
	this.Comments = Comments;
	}
	 
	public String getCost()
	{
	return Cost;
	}
	 
	public void setCost(String Cost)
	{
	this.Cost =Cost;
	}
	public String getRisk()
	{
	return Risk;
	}
	 
	public void setRisk(String Risk)
	{
	this.Risk =Risk;
	}
	public String getQuality()
	{
	return Quality;
	}
	 
	public void setQuality(String Quality)
	{
	this.Quality =Quality;
	}
	public String getStatus()
	{
	return Status;
	}
	 
	public void setStatus(String Status)
	{
	this.Status =Status;
	}
	
	 
	@Override
	public String toString()
	{
	return "MetricDetails [ Phase=" + Phase + ", Resources=" +Resources
	+ ", Comments=" + Comments + ",Cost=" + Cost + ", Risk=" + Risk
	+ ", Quality=" + Quality + ",Status=" + Status + "]";
	}
	 
}
