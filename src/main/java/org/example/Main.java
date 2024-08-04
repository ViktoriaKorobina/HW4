package org.example;


import java.util.Set;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник

 */
public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();


        directory.addEmployee(new Employee(101, 123456789, 5, "John"));
        directory.addEmployee(new Employee(102, 987654321, 3, "Alice"));
        directory.addEmployee(new Employee(103, 985656722, 3, "Alice"));


        Set<Employee> experiencedEmployees = directory.findEmployeesByExperience(5);
        System.out.println("Experienced employees: " + experiencedEmployees);


        Set<Employee> alicePhoneNumber = directory.findPhoneNumberByName("Alice");
        System.out.println("Alice's phone number: " + alicePhoneNumber);


        Employee findEmployee = directory.findEmployeeByPersonnelNumber(101);
        System.out.println("Employee with personnel number 101: " + findEmployee.getName());
    }
}