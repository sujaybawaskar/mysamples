package org.restsample.rest.resource;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/myresource")
@Singleton
public class MyResource {
	
	@GET
	public String getResource(){
		return "myresource";
	}
}
