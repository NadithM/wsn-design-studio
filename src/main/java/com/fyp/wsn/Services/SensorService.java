package com.fyp.wsn.Services;

import com.fyp.wsn.DataAccess.AllFunctionsDAO;
import com.fyp.wsn.DataAccess.SensorDAO;
import com.fyp.wsn.Entity.AllFunctions;
import com.fyp.wsn.Entity.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Asela on 4/30/2017.
 */

//This annotation is to indicate this is service class
@Service
public class SensorService {

    // connect with data access class
    @Autowired
    private SensorDAO sensorDAO;

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

        String value="String  getHUM(){\n" +
                "  OneWire oneWire(DIGITAL_INPUT1);\n" +
                "  OneWire oneWire(DIGITAL_INPUT2);\n" +
                "  DallasTemperature DS18B20(&oneWire);\n" +
                "  \n" +
                "  float temp;\n" +
                "  DS18B20.requestTemperatures(); \n" +
                "  temp = DS18B20.getTempCByIndex(0);\n" +
                "   \n" +
                "  return String(temp, 3);\n" +
                "}";

        sensor.setCpp_function(value);

        this.sensorDAO.insertSensor(sensor);
    }
}
