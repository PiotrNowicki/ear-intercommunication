package com.piotrnowicki.earintercommunication.service;

import java.util.logging.Logger;

import javax.ejb.Local;
import javax.ejb.Stateless;

import com.piotrnowicki.earintercommunication.api.MyService;

@Stateless(name="MyServiceBean")
@Local(MyService.class)
public class MyServiceBean implements MyService {

	private final Logger LOGGER = Logger.getLogger(MyServiceBean.class
			.getName());

	@Override
	public String invoke(String data) {
		LOGGER.info("*************** EJB BEAN METHOD INVOKED");

		return "AFTER INVOCATION: " + data;
	}
}
