package com.example.factorymethod;

public class EmployeeFactory {
    public static EmployeeDTO createEmployeeOfType(
            Integer id, String firstName, String lastName, String type){
        if ("manager".equals(type) || "director".equals(type)){
            EmployeeDTO employee = new EmployeeDTO();

            employee.setId(id);
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setDesignation(type);

            return employee;
        } else {
            throw new IllegalArgumentException("Unknown product");
        }
    }
}
