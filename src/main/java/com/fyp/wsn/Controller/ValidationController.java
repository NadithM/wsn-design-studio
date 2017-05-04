package com.fyp.wsn.Controller;

import com.fyp.wsn.Entity.Sensor;
import com.fyp.wsn.Entity.Validation;
import com.fyp.wsn.Services.SensorService;
import com.fyp.wsn.Services.ValidationService;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nadith Premaratne on 03/05/2017.
 */

@RestController
// This is how you map your end points to entire class
@RequestMapping("/validation")
//This annotation for auto generate API documentation
@Api(
        name = "Validation API",
        description = "This API provides set of methords that can use to validate what user is designed can be done"
)
public class ValidationController {

    // connecting with sensor service class(where business logic is implemented)
    @Autowired
    private ValidationService validationService;

    @RequestMapping(method = RequestMethod.POST)
    @ApiMethod(description = "Validation is done")
    public Validation getValidation(@RequestBody Validation validation){
        return validationService.getValidation(validation);
    }


}
