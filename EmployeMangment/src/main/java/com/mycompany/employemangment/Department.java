/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employemangment;

public class Department {
    private String departmentName;
    private String designation;

    public Department(String departmentName,String designation){
        this.departmentName = departmentName;
        this.designation = designation;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    public String getDesignation() {
        return designation;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

