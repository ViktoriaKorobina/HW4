package org.example;

public class Employee {
    private Integer personnelNumber;
    private Integer phoneNumber;
    private Integer experience;
    private String name;

    public Employee(Integer personnelNumber, Integer phoneNumber, Integer experience, String name) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.name = name;
    }

    public Integer getPersonnelNumber() {
        return personnelNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + ", Табельный номер: " + personnelNumber;
    }
}
