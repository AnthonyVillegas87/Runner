package com.encypher.spring.runner.enterprise.webService;

import com.encypher.spring.runner.enterprise.businessService.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }

}


