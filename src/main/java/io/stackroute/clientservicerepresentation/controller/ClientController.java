package io.stackroute.clientservicerepresentation.controller;

import io.stackroute.clientservicerepresentation.domain.ClientRepresentative;
import io.stackroute.clientservicerepresentation.services.ClientServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "api/v1")
@RestController
public class ClientController {

    private ClientServices clientServices;

    public ClientController(ClientServices clientServices) {
        this.clientServices = clientServices;
    }

    @GetMapping("cs")
    public ResponseEntity<?> getAllEvents(@RequestParam(value = "limit") int limit){
        ResponseEntity responseEntity;
        try {
            clientServices.getInfo(limit);
            responseEntity = new ResponseEntity<String>("Fetcheh successful",HttpStatus.OK);
        }catch (Exception ex)
        {
            responseEntity = new ResponseEntity<String>(ex.getMessage(),HttpStatus.NO_CONTENT);
        }
        return responseEntity;
    }

    @PostMapping("cs")
    public ResponseEntity<?>saveEvents(@RequestBody ClientRepresentative clientRepresentative) {
        ResponseEntity responseEntity;

        try {
            clientServices.saveUser(clientRepresentative);
            responseEntity = new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    @PutMapping("cs/{id}")
    public ResponseEntity<?> updateinfo(@RequestParam String feedback,@PathVariable(value = "id") int id)
    {
        ResponseEntity responseEntity ;
        try {
            clientServices.updateFeedback(id,feedback);
            responseEntity = new ResponseEntity<String>("updated successfull", HttpStatus.CREATED);
        }
        catch (Exception ex)
        {
            responseEntity = new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;

    }

    @GetMapping("cs/{email}")
    public ResponseEntity<?> fetchData(@PathVariable(value = "email") String email){
        ResponseEntity responseEntity;

        try {
            clientServices.fetchAssignedTickets(email);
            responseEntity = new ResponseEntity<String>("Fetched Successfull by email",HttpStatus.OK);
        }catch (Exception ex){
            responseEntity = new ResponseEntity<String>(ex.getMessage(),HttpStatus.NO_CONTENT);
        }

        return responseEntity;
    }


}
