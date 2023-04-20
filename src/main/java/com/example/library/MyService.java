package com.example.library;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {
    ServiceProperties serviceProperties;

    public MyService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }
//important (14-17)
    public String message(){
        if(serviceProperties.isEnabled())
         return serviceProperties.message;
        return "Disabled";
    }

}
