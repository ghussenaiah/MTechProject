package webService;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 import model.AccessManager5;
import com.google.gson.Gson;

import dto.MileStoneDetails;
 @Path("/mil1")

public class MileStoneDet {

	 @GET
		@Path("/mil2")
		@Produces("application/json")
		public String MileStone()
		{
		String mil = null;
		ArrayList<MileStoneDetails> milList = new ArrayList<MileStoneDetails>();
		try
		{
		milList = new AccessManager5().getMil();
		Gson gson = new Gson();
		mil = gson.toJson(milList);
		} catch (Exception e)
		{
		e.printStackTrace();
		}
		return mil;
		}
	
}
