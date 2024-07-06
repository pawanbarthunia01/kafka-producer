package com.producer.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private Integer empId;
    private String empName;
    private String clientName;
    private Double salary;
    private String doj;


}
