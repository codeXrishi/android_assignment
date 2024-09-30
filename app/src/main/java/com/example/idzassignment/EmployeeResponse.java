package com.example.idzassignment;

import java.util.List;

public class EmployeeResponse {
    private List<EmployeeModel> employees;

    public List<EmployeeModel> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeModel> employees) {
        this.employees = employees;
    }
}
