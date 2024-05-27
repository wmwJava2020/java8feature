package org.stream.api.java8feature;

public class Employee {

    private int empId;
    private String firstName;
    private String lastName;
    private double salary;
    private String dept;
    private int age;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    private Role role;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(int empId, String firstName, String lastName, double salary, String dept, int age, String gender, Role role) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dept = dept;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", role=" + role +
                '}';
    }
}
