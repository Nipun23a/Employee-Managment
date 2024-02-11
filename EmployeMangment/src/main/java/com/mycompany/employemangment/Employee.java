/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employemangment;

public class Employee extends Department{
    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhoneNumber;
    public Employee(String employeeFirstName,String employeeLastName,String departmentName, String designation,String employeePhoneNumber) {
        super(departmentName, designation);
       this.employeeFirstName = employeeFirstName;
       this.employeeLastName = employeeLastName;
       this.employeePhoneNumber = employeePhoneNumber;
    }


    

    public String getEmployeeFirstName(){
        return employeeFirstName;
    }
    public String getEmployeeLastName(){
        return employeeLastName;
    }
    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }
     @Override
    public String getDesignation() {
        return super.getDesignation();
    }

    @Override
    public String getDepartmentName() {
        return super.getDepartmentName();
    }

    @Override
    public void setDepartmentName(String departmentName) {
        super.setDepartmentName(departmentName);
    }

    @Override
    public void setDesignation(String designation) {
        super.setDesignation(designation);
    }


    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeePhoneNumber=" + employeePhoneNumber +
                '}';
    }
}

