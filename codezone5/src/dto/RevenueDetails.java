package dto;

public class RevenueDetails {

	
	
	private int NpiRevenue;
	private int RDBudget;
	private int RDBudgetActual;
	private int revenue2016;
	private int revenue2017;
	
	 
	public RevenueDetails()
	{
	 
	}
	 
	public RevenueDetails(int NpiRevenue,int RDBudget,int RDBudgetActual,int revenue2016,int revenue2017)
	{
	super();
	this.NpiRevenue = NpiRevenue;
	this.RDBudget = RDBudget;
	this.RDBudgetActual = RDBudgetActual;
	this.revenue2016 = revenue2016;
	this.revenue2017 = revenue2017;
	}
	 
	public int getNpiRevenue()
	{
	return NpiRevenue;
	}
	 
	public void setNpiRevenue(int NpiRevenue)
	{
	this.NpiRevenue = NpiRevenue;
	}
	 
	public int getRDBudget()
	{
	return RDBudget;
	}
	 
	public void setRDBudget(int RDBudget)
	{
	this.RDBudget = RDBudget;
	}
	 
	public int getRDBudgetActual()
	{
	return RDBudgetActual;
	}
	 
	public void setRDBudgetActual(int RDBudgetActual)
	{
	this.RDBudgetActual = RDBudgetActual;
	}
	 
	public int getrevenue2016()
	{
	return revenue2016;
	}
	 
	public void setrevenue2016(int revenue2016)
	{
	this.revenue2016 = revenue2016;
	}
	public int getrevenue2017()
	{
	return revenue2017;
	}
	 
	public void setrevenue2017(int revenue2017)
	{
	this.revenue2017 = revenue2017;
	}
	 
	@Override
	public String toString()
	{
	return "RevenueDetails [NpiRevenue=" + NpiRevenue+ ", RDBudget=" + RDBudget + ", RDBudgetActual=" + RDBudgetActual
	+ ", revenue2016=" + revenue2016 + ",revenue2017=" + revenue2017 + "]";
	}
}
