package io.stackroute.clientservicerepresentation.services;

import io.stackroute.clientservicerepresentation.domain.ClientRepresentative;

import java.util.List;

public interface ClientServices {

    public ClientRepresentative saveUser(ClientRepresentative user);
    public List<ClientRepresentative> getInfo(int limit);
    public List<ClientRepresentative> limitedList(String number);
    public ClientRepresentative updateFeedback(int id,String feedback);

    public List<ClientRepresentative> fetchAssignedTickets(String email);


}
