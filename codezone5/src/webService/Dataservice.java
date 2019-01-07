package webService;
 
import java.util.ArrayList;
 import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 import com.google.gson.Gson;
 import model.AccessManager7;
import dto.Data;
 
@Path("/data1")
public class Dataservice
{
@GET
@Path("/data2")
@Produces("application/json")
public String data1()
{
String da = null;
ArrayList<Data> dataList = new ArrayList<Data>();
try
{
dataList = new AccessManager7().getData();
Gson gson = new Gson();
da = gson.toJson(dataList);
} catch (Exception e)
{
e.printStackTrace();
}
return da;
}
}