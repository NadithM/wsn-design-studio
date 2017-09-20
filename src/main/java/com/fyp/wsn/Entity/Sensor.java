package com.fyp.wsn.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Asela on 5/3/2017.
 * This class define data entity (data structure) that connect with json objects
 */

//corresponding document in database
@Document(collection = "sensors")
public class Sensor {

    //Id of record
    @Id
    private String id;
    private String display_name;
    private String model_name;
    private String rated_current;
    private String power_supply;
    private String description;

    private String configuration;
    private String color;

    private String cpp_function;
    private String cpp_initialize;
    private String cpp_includes;

    private String python_includes;
    private String python_initialize;
    private String python_function;


    private String pin_map;

    //constructors and getters and setters are auto generated

    public String getRated_current() {
        return rated_current;
    }

    public void setRated_current(String rated_current) {
        this.rated_current = rated_current;
    }

    public String getPower_supply() {
        return power_supply;
    }

    public void setPower_supply(String power_supply) {
        this.power_supply = power_supply;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPython_includes() {
        return python_includes;
    }

    public void setPython_includes(String python_includes) {
        this.python_includes = python_includes;
    }

    public String getPython_initialize() {
        return python_initialize;
    }

    public void setPython_initialize(String python_initialize) {
        this.python_initialize = python_initialize;
    }

    public String getPython_function() {
        return python_function;
    }

    public void setPython_function(String python_function) {
        this.python_function = python_function;
    }

    public String getCpp_initialize() {
        return cpp_initialize;
    }

    public void setCpp_initialize(String cpp_initialize) {
        this.cpp_initialize = cpp_initialize;
    }

    
    public String getCpp_includes() {
        return cpp_includes;
    }

    public void setCpp_includes(String cpp_includes) {
        this.cpp_includes = cpp_includes;
    }

    public String getCpp_function() {
        return cpp_function;
    }

    public void setCpp_function(String cpp_function) {
        this.cpp_function = cpp_function;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sensor() {
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public Sensor(String id, String display_name, String model_name, String rated_current, String power_supply, String description, String configuration, String color, String cpp_function, String cpp_initialize, String cpp_includes, String python_includes, String python_initialize, String python_function, String pin_map) {
        this.id = id;
        this.display_name = display_name;
        this.model_name = model_name;
        this.rated_current = rated_current;
        this.power_supply = power_supply;
        this.description = description;
        this.configuration = configuration;
        this.color = color;
        this.cpp_function = cpp_function;
        this.cpp_initialize = cpp_initialize;
        this.cpp_includes = cpp_includes;
        this.python_includes = python_includes;
        this.python_initialize = python_initialize;
        this.python_function = python_function;
        this.pin_map = pin_map;
    }

    public Sensor(String id, String display_name, String model_name, String rated_current, String power_supply, String description, String configuration, String color, String cpp_function, String cpp_initialize, String cpp_includes, String python_includes, String python_initialize, String python_function) {
        this.id = id;
        this.display_name = display_name;
        this.model_name = model_name;
        this.rated_current = rated_current;
        this.power_supply = power_supply;
        this.description = description;
        this.configuration = configuration;
        this.color = color;
        this.cpp_function = cpp_function;
        this.cpp_initialize = cpp_initialize;
        this.cpp_includes = cpp_includes;
        this.python_includes = python_includes;
        this.python_initialize = python_initialize;
        this.python_function = python_function;
    }

    public String getId() {
        return id;
    }

    public Sensor(String display_name, String model_name) {
        this.display_name = display_name;
        this.model_name = model_name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
}
