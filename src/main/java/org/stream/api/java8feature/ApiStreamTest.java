package org.stream.api.java8feature;
import java.util.*;
import java.util.stream.Collectors;

public class ApiStreamTest {
    static List<Employee> empList = EmployeeData.employeesData();
    static void addEmployeeAgeGrt51() {
        Map<Boolean, List<Employee>> map = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() <= 51));
        for(Map.Entry<Boolean, List<Employee>> map1 : map.entrySet()){
            System.out.println(map1.getKey() +":"+map1.getValue());
        }
    }
    static void getEmployeesCntByDept(){
        Map<String, Long> add = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        for(Map.Entry<String,Long> ls : add.entrySet()){
            System.out.println(ls.getKey()+":"+ls.getValue());
        }
    }
    static  void getEmployeeWhereRolesLikeM(){
        Map<Role,Long> map = empList.stream().collect(Collectors.groupingBy(Employee::getRole,Collectors.counting()));
        for(Map.Entry<Role, Long> m : map.entrySet()){
            if(m.getKey().toString().startsWith("A")){
                System.out.println(m.getKey()+":"+m.getValue());
            }
        }
    }
    static void getTheSecondHighSalary(){
        Optional<Employee> secondHigh = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed())
                .skip(1)
                .findFirst();
        System.out.println("The Second High : "+secondHigh);

    }
    static void getEmployeeGenderByDept(){
        List<Employee> collect = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender))
                .values()
                .stream()
                .map(s->s.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null))
                .collect(Collectors.toList());
        for (Employee employee : collect) {
            System.out.println(employee.toString());
        }

    }
    public static void main(String[] args) {
        //addEmployeeAgeGrt51();
        //getEmployeesCntByDept();
        //getEmployeeWhereRolesLikeM();
        //getTheSecondHighSalary();
        getEmployeeGenderByDept();
    }
}
