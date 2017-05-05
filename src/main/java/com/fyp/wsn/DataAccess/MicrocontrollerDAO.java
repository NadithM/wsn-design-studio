package com.fyp.wsn.DataAccess;

import com.fyp.wsn.Entity.Microcontroller;
import com.fyp.wsn.Entity.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Nadith Premaratne on 03/05/2017.
 */

@Component
public class MicrocontrollerDAO {

    @Autowired
    private MicrocontrollerRepository microcontrollerRepository;


    public Collection<Microcontroller> getAllMicrocontrollers() {
        return microcontrollerRepository.findAll();
    }

    public Microcontroller getMicrocontrollerById(String id) {
        return microcontrollerRepository.findOne(id);
    }

    public void insertMicrocontroller(Microcontroller microcontroller) {
        microcontrollerRepository.save(microcontroller);
    }

    public void removeMicrocontrollerById(String id) {
        microcontrollerRepository.delete(microcontrollerRepository.findOne(id));
    }

    public void updateMicrocontrollerById(Microcontroller microcontroller) {
        Microcontroller temp_microcontroller = microcontrollerRepository.findOne(microcontroller.getId());
        temp_microcontroller.setName(microcontroller.getName());
        temp_microcontroller.setType(microcontroller.getType());
        microcontrollerRepository.save(temp_microcontroller);

    }
}
