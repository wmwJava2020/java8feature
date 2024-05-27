package org.stream.api.java8feature;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    static List<Employee> employeesData(){

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1001,"Alex","Json",1500,"HR",26,"Male",Role.MANAGER));
        employees.add(new Employee(1002,"Jacki","Will",2500,"IT",35,"Female",Role.SUPERVISOR));
        employees.add(new Employee(1003,"Hall","Jackson",2000,"Sales",51,"Male",Role.ADMIN));
        employees.add(new Employee(1004,"Jonson","Alexa",5510,"TRAN",55,"Male",Role.ASSOCIATE));
        employees.add(new Employee(1005,"Haile","Janet",5000,"MNGT",49,"Female",Role.PRESIDENT));
        employees.add(new Employee(1006,"Say","Jack",2500,"HR",29,"Male",Role.ADMIN));
        employees.add(new Employee(1007,"Willy","Andy",1100,"HR",45,"Female",Role.MANAGER));
        employees.add(new Employee(1008,"Drew","Philly",8500,"Sales",32,"Male",Role.ASSOCIATE));
        employees.add(new Employee(1009,"Alexi","Json",1900,"IT",36,"Female",Role.MANAGER));
        employees.add(new Employee(10010,"Jackson","Matt",5500,"TRAN",55,"Male",Role.SUPERVISOR));

        return employees;
    }

}
