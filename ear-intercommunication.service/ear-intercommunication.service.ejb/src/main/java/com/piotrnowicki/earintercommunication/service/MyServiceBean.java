package com.piotrnowicki.earintercommunication.service;

import java.util.logging.Logger;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.piotrnowicki.earintercommunication.api.MyService;

@Stateless(name = "MyServiceBean")
@Remote(MyService.class)
public class MyServiceBean implements MyService {

    private final Logger LOGGER = Logger.getLogger(MyServiceBean.class.getName());

    @Override
    public String invoke(String data) {
        LOGGER.info("*************** MyServiceBean#invoke(-) method invoked.");

        return "After invocation: " + data;
    }
}
