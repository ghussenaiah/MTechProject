package webService;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 



import model.AccessManager2;

import com.google.gson.Gson;

import dto.ProjectDetails;
 




@Path("/pro1")
public class ProjectDesc {

	
	
	@GET
	@Path("/pro2")
	@Produces("application/json")
	public String Project()
	{
	String pro = null;
	ArrayList<ProjectDetails> proList = new ArrayList<ProjectDetails>();
	try
	{
	proList = new AccessManager2().getPro();
	Gson gson = new Gson();
	pro = gson.toJson(proList);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return pro;
	}
}
