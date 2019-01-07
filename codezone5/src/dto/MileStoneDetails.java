package dto;

public class MileStoneDetails {

	private String RFPComment;
	private String Product_Dev_High;
	private String keyeve;
	private String Innolvation;

	public MileStoneDetails()
	{
	 
	}
	 
	public MileStoneDetails(String RFPComment,String Product_Dev_High,String keyeve,String Innolvation)
	{
	super();
	
	this.RFPComment = RFPComment;
	this.Product_Dev_High = Product_Dev_High;
	this.keyeve = keyeve;
	this.Innolvation = Innolvation;
	}
	 
	public String getRFPComment()
	{
	return RFPComment;
	}
	 
	public void setRFPComment(String RFPComment)
	{
	this.RFPComment = RFPComment;
	}
	 
	 
	public String getProduct_Dev_High()
	{
	return Product_Dev_High;
	}
	 
	public void setProduct_Dev_High(String Product_Dev_High)
	{
	this.Product_Dev_High = Product_Dev_High;
	}
	 
	public String getkeyeve()
	{
	return keyeve;
	}
	 
	public void setkeyeve(String keyeve)
	{
	this.keyeve = keyeve;
	}
	 
	public String getInnolvation()
	{
	return Innolvation;
	}
	 
	public void setInnolvation(String Innolvation)
	{
	this.Innolvation =Innolvation;
	}
	
	
	 
	@Override
	public String toString()
	{
	return "MileStoneDetails[ RFPComment=" + RFPComment+ ",Product_Dev_High=" +Product_Dev_High+ ", keyeve=" + keyeve + ",Innolvation=" + Innolvation + "]";
	}
	 
}
