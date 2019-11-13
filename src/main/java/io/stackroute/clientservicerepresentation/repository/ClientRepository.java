package io.stackroute.clientservicerepresentation.repository;

import io.stackroute.clientservicerepresentation.domain.ClientRepresentative;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends MongoRepository<ClientRepresentative,Integer> {

    @Query("{'assignedTo' : ?0}")
    List<ClientRepresentative> getListToCsr(String assignedTo);


}
