package org.example;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDirectory {
    private Set<Employee> employees;

    public EmployeeDirectory() {
        employees = new HashSet<>();
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    public Set<Employee> findEmployeesByExperience(int targetExperience) {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == targetExperience) {
                result.add(employee);
            }
        }
        return result;
    }


    public Set<Employee> findPhoneNumberByName(String targetName) {
        Set<Employee> result = new HashSet<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(targetName)) {
                result.add(employee);
            }
        }
        return result;
    }


    public Employee findEmployeeByPersonnelNumber(int targetPersonnelNumber) {
        for (Employee employee : employees) {
            if (employee.getPersonnelNumber() == targetPersonnelNumber) {
                return employee;
            }
        }
        return null;
    }
}


