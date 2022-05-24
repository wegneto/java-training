package org.example;

public class Department {

    private final String name;

    private final int MAX_EMPLOYEES = 10;

    private int numberOfEmployees = 0;

    private final Employee[] employees = new Employee[MAX_EMPLOYEES];

    public Department(String name) {
        this.name = name;
    }

    public boolean addEmployee(Employee employee) {
        if (numberOfEmployees == MAX_EMPLOYEES) {
            return false;
        }

        System.out.println("Adding: " + employee);
        numberOfEmployees++;
        employees[numberOfEmployees - 1] = employee;

        return true;
    }

    public Employee[] getEmployees() {
        if (numberOfEmployees == 0) {
            return null;
        }

        Employee[] result = new Employee[numberOfEmployees];
        for (int i = 0; i < numberOfEmployees; i++) {
            result[i] = employees[i];
        }

        return result;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

    public double getTotalSalary() {
        double result = 0.0;

        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.getSalary();
            }
        }

        return result;
    }

    public double getAverageSalary() {
        return getTotalSalary() / numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", MAX_EMPLOYEES=" + MAX_EMPLOYEES +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }
}
