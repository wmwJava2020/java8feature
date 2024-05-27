/**
 * @author Wondafrash
 * @Date 5/27/2024
 */
package org.stream.api.java8feature;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.stream.api.java8feature.Role.ADMIN;

public class GroupEmployeeWhere {

    // I have a list of Employee
    static List<Employee> data = EmployeeData.employeesData();
    //static List<Employee> data0 = EmployeeData.data();

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

    private static void _rolesEqualsAssociate(){

        Map<Role, Map<Boolean, List<Employee>>> admin = data.stream() // dump input into stream to leverage the stream functionality
                .collect(Collectors.groupingBy(Employee::getRole, Collectors.groupingBy(e -> e.getRole().equals(ADMIN))));
        System.out.println("Roles Admin : "+ admin);
    }

    private static void _highestSalaryIs(){
        List<Employee> salary = data.stream() // dump into stream
                .sorted(Comparator.comparing(Employee::getSalary).reversed()) // sort , compare using Comparing interface, reversed it
                .collect(Collectors.toList()); // collect it to list
        salary.forEach(System.out::println);
    }

    private static void _olderEmployee(){
        List<Employee> age = data.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).toList();
        System.out.println("Age = " + age);
    }

    private static void nthSalaryOfEmployee(){
   List<Employee> nthData = data.stream().collect(Collectors.groupingBy(Employee::getDept))
           .values()
           .stream()
           .map(e-> e.stream()
           .max(Comparator.comparing(Employee::getSalary))
           .orElse(null))
                   .toList();
        nthData.forEach(System.out::println);

    }

    public static void main(String[] args) {
        //_countEmployeesByGender();
        //_lastNameStartsWithJ();
        //_rolesEqualsAssociate();
        //_highestSalaryIs();
        //_olderEmployee();
        System.out.println();
        nthSalaryOfEmployee();
    }

}
