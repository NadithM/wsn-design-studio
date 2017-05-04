package com.fyp.wsn.Services;

import com.fyp.wsn.DataAccess.ClientSessionDAO;
import com.fyp.wsn.DataAccess.MicrocontrollerDAO;
import com.fyp.wsn.DataAccess.SensorDAO;
import com.fyp.wsn.Entity.ClientSession;
import com.fyp.wsn.Entity.Sensor;
import com.fyp.wsn.Entity.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Nadith Premaratne on 03/05/2017.
 */
@Service
public class ValidationService {

    @Autowired
    private MicrocontrollerDAO microcontrollerDAO;
    @Autowired
    private ClientSessionDAO clientSessionDAO;

    final int SUCCESSCODE=200;


    public Validation getValidation(Validation validation) {

        if(validation.getCode()==SUCCESSCODE){
            if(validation.getId().equals("0")){
                ClientSession new_client=new ClientSession();


            }
            else{



            }

        }

        else return validation;


        return validation;
    }
}
