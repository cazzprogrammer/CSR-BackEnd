package io.stackroute.clientservicerepresentation.repository;

import io.stackroute.clientservicerepresentation.domain.ClientRepresentative;
import io.stackroute.clientservicerepresentation.domain.CsrInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ClientInfoRepository extends MongoRepository<CsrInfo,Integer> {

    @Query("{'email' : ?0}")
    CsrInfo getInfoByEmail(String email);
}
