package com.matei.springboot101.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "myendpoint")
public class MyCustomEndpoints {

    @ReadOperation
    public String test(){
        return ":)";
    }
}
