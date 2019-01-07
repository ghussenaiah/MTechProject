package dto;
 
public class Cost
{

private double Cost;
 
public Cost()
{
 
}
 
public Cost( double Cost)
{
super();

this.Cost = Cost;
}
 

 
public double getCost()
{
return Cost;
}
 
public void setCost(double Cost)
{
this.Cost = Cost;
}
 
@Override
public String toString()
{
return "Cost [Cost=" + Cost + "]";
}
 
}