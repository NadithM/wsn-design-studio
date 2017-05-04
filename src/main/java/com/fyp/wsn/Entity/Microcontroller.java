package com.fyp.wsn.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Nadith Premaratne on 03/05/2017.
 */
@Document(collection = "microcontroller")
public class Microcontroller {


    @Id
    private String id;
    private String name;
    private String allias;
    private String color;
    private String type;

    public Microcontroller() {
    }

    public Microcontroller(String id, String name, String allias, String color, String type) {
        this.id = id;
        this.name = name;
        this.allias = allias;
        this.color = color;
        this.type = type;
    }

    public String getId() {
        return id;
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

    public String getAllias() {
        return allias;
    }

    public void setAllias(String allias) {
        this.allias = allias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
