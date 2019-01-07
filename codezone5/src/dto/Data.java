package dto;
 
public class Data
{

private String Details;
private String Status;

 
public Data()
{
 
}
 
public Data(String Details, String Status)
{
super();

this.Details = Details;
this.Status = Status;

}
 
public String getDetails()
{
return Details;
}
 
public void setDetails(String Details)
{
this.Details = Details;
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
return "Data [ Details=" + Details + ", Status=" + Status
+ "]";
}
 
}