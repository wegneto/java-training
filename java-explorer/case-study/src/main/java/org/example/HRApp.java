package org.example;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("Application is starting...");

        Department itDepartment = new Department("IT");
        System.out.println(itDepartment);

        System.out.println("\n--- Adding new employees --- ");
        Employee e1 = new Employee(230, "Bob", 333998);
        Employee e2 = new Employee(420, "Alice", 3392823);
        itDepartment.addEmployee(e1);
        itDepartment.addEmployee(e2);
        itDepartment.addEmployee(new Employee(772, "Jack", 2998));

        System.out.println("\n--- Finding employee with id == 1--- ");
        System.out.println(itDepartment.findEmployeeById(420));

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
