package com.encypher.spring.runner.enterprise.dataService;

import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DataService {

    public List<Integer> getData() {
        return Arrays.asList(10, 20, 30, 40);
    }
}