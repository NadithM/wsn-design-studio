package com.fyp.wsn.Services;

import com.fyp.wsn.DataAccess.SensorDAO;
import com.fyp.wsn.Entity.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Asela on 4/30/2017.
 */

//This annotation is to indicate this is service class
@Service
public class SensorService {

    // connect with data access class
    @Autowired
    private SensorDAO sensorDAO;

    // All the business logic will be implemented in here as functions data that need for that logic wil be get from
    // DataAccess class

    public Collection<Sensor> getAllSensors(){

        return this.sensorDAO.getAllSensors();
    }

    public Sensor getSensorById(String id){

        return this.sensorDAO.getSensorById(id);
    }

    public void removeSensorById(String id) {

        this.sensorDAO.removeSensorById(id);
    }

    public void updateSensorById(Sensor sensor){

        this.sensorDAO.updateSensorById(sensor);
    }

    public void insertSensor(Sensor sensor) {
        this.sensorDAO.insertSensor(sensor);
    }
}
