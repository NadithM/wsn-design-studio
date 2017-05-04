package com.fyp.wsn.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Nadith Premaratne on 04/05/2017.
 */
@Document(collection = "clientsession")
public class ClientSession {

    @Id
    private String id;
    private String configuration;


    public ClientSession() {
    }

    public ClientSession(String id, String configuration) {
        this.id = id;
        this.configuration = configuration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
