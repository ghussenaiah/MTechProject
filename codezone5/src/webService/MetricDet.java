package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 import model.AccessManager3;
import com.google.gson.Gson;

import dto.MetricDetails;
@Path("/me1")
public class MetricDet {

	@GET
	@Path("/me2")
	@Produces("application/json")
	public String Metric()
	{
	String me = null;
	ArrayList<MetricDetails> meList = new ArrayList<MetricDetails>();
	try
	{
	meList = new AccessManager3().getMet();
	Gson gson = new Gson();
	me = gson.toJson(meList);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return me;
	}
	
}
