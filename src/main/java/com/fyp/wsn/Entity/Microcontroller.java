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
    private String display_name;
    private String allias;
    private String color;
    private String model_name;
    private String configuration;
    private String supported_lan;
    private String pin_map;

    public Microcontroller() {
    }

    public String getPin_map() {
        return pin_map;
    }

    public void setPin_map(String pin_map) {
        this.pin_map = pin_map;
    }

    public Microcontroller(String id, String display_name, String allias, String color, String model_name, String configuration, String supported_lan, String pin_map) {
        this.id = id;
        this.display_name = display_name;
        this.allias = allias;
        this.color = color;
        this.model_name = model_name;
        this.configuration = configuration;
        this.supported_lan = supported_lan;
        this.pin_map = pin_map;
    }

    public String getSupported_lan() {
        return supported_lan;
    }

    public void setSupported_lan(String supported_lan) {
        this.supported_lan = supported_lan;
    }

    public Microcontroller(String id, String display_name, String allias, String color, String model_name) {
        this.id = id;
        this.display_name = display_name;
        this.allias = allias;
        this.color = color;
        this.model_name = model_name;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getId() {
        return id;
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

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
}
