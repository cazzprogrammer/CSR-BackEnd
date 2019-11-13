package io.stackroute.clientservicerepresentation.services;

import io.stackroute.clientservicerepresentation.domain.ClientRepresentative;
import io.stackroute.clientservicerepresentation.domain.CsrInfo;
import io.stackroute.clientservicerepresentation.repository.ClientInfoRepository;
import io.stackroute.clientservicerepresentation.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ClientServiceImpl implements ClientServices {

    ClientRepository clientRepository;
    ClientInfoRepository csrInfo;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository,ClientInfoRepository csrInfo) {
        this.clientRepository = clientRepository;
        this.csrInfo = csrInfo;
    }

    @Override
    public ClientRepresentative saveUser(ClientRepresentative user) {
        ClientRepresentative userinfo = clientRepository.save(user);
        return userinfo;
    }

    @Override
    public List<ClientRepresentative> getInfo(int limit) {
        List<ClientRepresentative> list = clientRepository.findAll();
        List<ClientRepresentative> list1  = new ArrayList<>();
        for(int i =0;i<limit;i++)
        {
            list1.add(list.get(i));
        }

        return list1;
    }

    @Override
    public List<ClientRepresentative> limitedList(String number) {
        return null;
    }

    @Override
    public ClientRepresentative updateFeedback(int id, String feedback) {

        Optional<ClientRepresentative> client1 = clientRepository.findById(id);
        System.out.println("inside update");
        ClientRepresentative client2 = client1.get();
//        System.out.println(client2.getFeedback());
        client2.setFeedback(feedback);
//        System.out.println(client2.getFeedback());
        return clientRepository.save(client2);

    }

    @Override
    public List<ClientRepresentative> fetchAssignedTickets(String email) {
        System.out.println("fetchAssigned");
        CsrInfo csrInfo1 = csrInfo.getInfoByEmail(email);
        System.out.println(csrInfo1.getName());
        String assignedTo = csrInfo1.getName();
        return clientRepository.getListToCsr(assignedTo);
    }
}
