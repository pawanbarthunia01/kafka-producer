package com.producer.service;

import com.producer.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

        @Autowired
        private KafkaTemplate<String,Employee> kafkaTemplate;
        private final String TOPIC_NAME= "EMPLOYEE_TOPIC";



        public String sendData(Employee employee){
         if(employee.getEmpId()!=0){
             kafkaTemplate.send(TOPIC_NAME,employee);
             return "send Data";
         }else{
             return "Data not send";
         }
        }

}
