package com.youtube.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/t1")
public class Hello {

	
		@Path("/t2")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnTitle()
		
		{
			return "welcome honeywell david ";
		}
		@Path("/t3")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnTitle1()
		
		{
			return "WELCOME TO HONEYWELL DAVID ";
		}
		
	}
