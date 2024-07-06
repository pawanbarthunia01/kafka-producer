package com.producer.controller;

import com.producer.model.Employee;
import com.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @PostMapping("/")
    public ResponseEntity<String> produceEmployee(@RequestBody Employee employee){
    return new ResponseEntity<>(producerService.sendData(employee), HttpStatus.CREATED);
}

}
