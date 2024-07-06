package com.producer.service;

import com.google.gson.Gson;
import com.producer.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

        @Autowired
        private KafkaTemplate<String,String> kafkaTemplate;

        private final String TOPIC_NAME= "EMPLOYEE_TOPIC";



        public String sendData(Employee employee){
         if(employee.getEmpId()!=0){
             String json=new Gson().toJson(employee);
             kafkaTemplate.send(TOPIC_NAME,json);
             return "send Data";
         }else{
             return "Data not send";
         }
        }

}
