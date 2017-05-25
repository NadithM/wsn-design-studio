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
    private String name;
    private String type;
    private String configuration;
    private String color;
    private String cpp_function;
    private String cpp_includes;
    private String pin_map;

    //constructors and getters and setters are auto generated


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

    public Sensor(String id, String name, String type, String configuration, String color, String cpp_function, String cpp_includes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.configuration = configuration;
        this.color = color;
        this.cpp_function = cpp_function;
        this.cpp_includes = cpp_includes;
    }

    public String getId() {
        return id;
    }

    public Sensor(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
