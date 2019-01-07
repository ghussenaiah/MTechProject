package dto;




public class GetRollId
{

private String RollId;

 
public GetRollId()
{
 
}
 
public GetRollId(String RollId)
{
super();
this.RollId = RollId;

}
 
public String getId()
{
return RollId;
}
 
public void setId(String RollId)
{
this.RollId = RollId;
}
 

 
@Override
public String toString()
{
return "GetRollId[RollId=" + RollId + "]";
}
 
}