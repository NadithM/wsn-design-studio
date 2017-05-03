package com.fyp.wsn.DataAccess;


import com.fyp.wsn.Entity.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Asela on 4/30/2017.
 * This is the class that dealing with database
 * follwing link has inbuilt functions
 * http://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/mongo.repositories.html
 */
@Component
public class SensorDAO {

    // connecting with pre built functionality
    @Autowired
    private SensorRepository sensorRepository;


    public Collection<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }

    public Sensor getSensorById(String id) {
        return sensorRepository.findOne(id);
    }

    public void insertSensor(Sensor sensor) {
        sensorRepository.save(sensor);
    }

    public void removeSensorById(String id) {
        sensorRepository.delete(sensorRepository.findOne(id));
    }

    public void updateSensorById(Sensor sensor) {
        Sensor temp_sensor = sensorRepository.findOne(sensor.getId());
        temp_sensor.setName(sensor.getName());
        temp_sensor.setType(sensor.getType());
        sensorRepository.save(temp_sensor);

    }
}
