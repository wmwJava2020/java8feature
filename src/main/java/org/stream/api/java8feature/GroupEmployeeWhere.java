/**
 * @author Wondafrash
 * @Date 5/27/2024
 */
package org.stream.api.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeWhere {

    // I have a list of Employee
    static List<Employee> data = EmployeeData.employeesData();

    private static void _countEmployeesByGender(){
        // here the out-put is mapping  [[gender with corresponding counts]]
        Map<String, Long> MAPs = data.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Count Genders : "+MAPs);
    }

    private static void _lastNameStartsWithJ(){
        Map<String, Map<Object, List<Employee>>> STR_ING = data.stream().
                collect(Collectors.groupingBy(Employee::getLastName, Collectors.groupingBy(e->e.getLastName().startsWith("J"))));
        System.out.println("Starts with J : "+ STR_ING);
    }

    private static void whereRolesEqualsAssociate(){
        
    }

    public static void main(String[] args) {
        _countEmployeesByGender();
        _lastNameStartsWithJ();
    }


}
