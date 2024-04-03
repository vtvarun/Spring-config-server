package com.HumanCloudMicroservices.Limitsservices.Controller;

import com.HumanCloudMicroservices.Limitsservices.Configuration.LimitConfiguration;
import com.HumanCloudMicroservices.Limitsservices.Model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
   LimitConfiguration limitConfiguration;

    @GetMapping("/get-limits")
    public Limits getLimits(){
        return new Limits(limitConfiguration.getMinimum(), limitConfiguration.getMaximum());
    }
}
