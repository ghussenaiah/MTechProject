package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.Product;;

@Path("product")
public class ProductRestful {
	
	@Path("findall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAll(){
		
		List<Product>  all=new ArrayList<Product>();
		
		all.add(new Product("1","ab",500));
		all.add(new Product("2","cd",500));
		all.add(new Product("3","ef",500));
		all.add(new Product("4","gh",500));
		all.add(new Product("5","ij",500));
		
		return all;
	}

}
