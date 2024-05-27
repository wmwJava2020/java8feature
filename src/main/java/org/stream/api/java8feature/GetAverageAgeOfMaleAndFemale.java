package org.stream.api.java8feature;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetAverageAgeOfMaleAndFemale {

    static List<Employee> ages = EmployeeData.employeesData();
    static private void getAverageAgesOfEmployee(){
        Map<String, Double> map = ages.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(e -> e.getAge())));
        System.out.println(map);
    }

    public static void main(String[] args) {
        getAverageAgesOfEmployee();
    }

}
