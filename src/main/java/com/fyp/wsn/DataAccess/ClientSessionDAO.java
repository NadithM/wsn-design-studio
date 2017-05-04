package com.fyp.wsn.DataAccess;

import com.fyp.wsn.Entity.ClientSession;
import com.fyp.wsn.Entity.Microcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Nadith Premaratne on 04/05/2017.
 */

@Component
public class ClientSessionDAO {


    @Autowired
    private ClientSessionRepository clientSessionRepository;


    public Collection<ClientSession> getAllClientSessions() {
        return clientSessionRepository.findAll();
    }

    public ClientSession getClientSessionById(String id) {
        return clientSessionRepository.findOne(id);
    }

    public void insertClientSession(ClientSession clientSession) {
        clientSessionRepository.save(clientSession);
    }

    public void removeClientSessionById(String id) {
        clientSessionRepository.delete(clientSessionRepository.findOne(id));
    }

    public void updateSensorById(ClientSession clientSession) {
        ClientSession temp_clientsession = clientSessionRepository.findOne(clientSession.getId());
        temp_clientsession.setConfiguration(clientSession.getConfiguration());
        clientSessionRepository.save(temp_clientsession);

    }
}
