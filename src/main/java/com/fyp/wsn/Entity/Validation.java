package com.fyp.wsn.Entity;

import org.springframework.data.annotation.Id;

/**
 * Created by Nadith Premaratne on 03/05/2017.
 */
public class Validation {

    //Id of record
    @Id
    private String id;
    private int code;
    private String error_description;
    private String config_diagram;
    private String type;



    public Validation(int code, String error_description, String config_diagram, String type) {
        this.code = code;
        this.error_description = error_description;
        this.config_diagram = config_diagram;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getError_description() {
        return error_description;
    }

    public String getConfig_diagram() {
        return config_diagram;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public void setConfig_diagram(String config_diagram) {
        this.config_diagram = config_diagram;
    }

    public void setType(String type) {
        this.type = type;
    }


}
