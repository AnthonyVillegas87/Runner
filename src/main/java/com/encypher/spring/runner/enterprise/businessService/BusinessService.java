package com.encypher.spring.runner.enterprise.businessService;

import com.encypher.spring.runner.enterprise.dataService.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

    @Autowired
    private DataService dataService;

    public long calculateSum() {
       List<Integer> data = dataService.getData();
        return  data.stream().reduce(Integer :: sum).get();
    }



}
