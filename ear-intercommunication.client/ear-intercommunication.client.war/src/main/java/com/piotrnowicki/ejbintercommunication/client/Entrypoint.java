package com.piotrnowicki.ejbintercommunication.client;


import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Entrypoint {

    @EJB
    Client client;
    
	@Path("invoke")
	@GET
	public String invoke() throws NamingException {
	    return client.invoke();
	}
}
