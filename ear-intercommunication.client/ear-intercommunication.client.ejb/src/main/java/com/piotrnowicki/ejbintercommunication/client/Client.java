package com.piotrnowicki.ejbintercommunication.client;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.piotrnowicki.earintercommunication.api.MyService;

@Stateless
public class Client {
	private final Logger LOGGER = Logger.getLogger(Client.class.getName());

	public String invoke() throws NamingException {
		LOGGER.info("CLIENT INVOKED");
		
		Context ctx = new InitialContext();
		Object bean = ctx.lookup("java:global/ear-intercommunication.service/ear-intercommunication.service.ejb-1.0-SNAPSHOT/MyServiceBean");
		
		MyService service = (MyService)bean;
		
		System.out.println(service);
		
		return service.invoke("test");
	}
}
