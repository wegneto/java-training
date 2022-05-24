package org.example;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("Application is starting...");

        Department itDepartment = new Department("IT");
        System.out.println(itDepartment);

        System.out.println("\n--- Adding new employees --- ");
        Employee e1 = new Employee(1, "Teste", 100.00);
        Employee e2 = new Employee(2, "Teste", 200.00);
        Employee e3 = new Employee(3, "Teste", 300.00);
        itDepartment.addEmployee(e1);
        itDepartment.addEmployee(e2);
        itDepartment.addEmployee(e3);

        System.out.println("\n--- Finding employee with id == 1--- ");
        System.out.println(itDepartment.findEmployeeById(e1.getId()));

        System.out.println("\n--- Get every employee in the department and print their information --- ");
        for (Employee employee : itDepartment.getEmployees()) {
            System.out.println(employee);
        }

        System.out.println("\n--- Print the total salary for that department --- ");
        System.out.println("Total salary: " + itDepartment.getTotalSalary());

        System.out.println("\n--- Print the average salary for that department --- ");
        System.out.println("Average salary: " + itDepartment.getAverageSalary());

    }
}
