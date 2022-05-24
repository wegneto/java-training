package org.example;

import org.junit.Assert;
import org.junit.Test;

public class DepartmentTest {

    @Test
    public void shouldAddEmployee() {
        Department d = new Department("Teste");
        Employee e = new Employee(1, "Teste", 10.00);

        boolean result = d.addEmployee(e);

        Assert.assertTrue(result);
    }

    @Test
    public void shouldNotAddEmployeeBeyondCapacity() {
        Department d = new Department("Teste");

        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(d.addEmployee(new Employee(i+1, "Teste", 10.00)));
        }

        boolean result = d.addEmployee(new Employee(11, "Teste", 10.00));
        Assert.assertFalse(result);
    }

    @Test
    public void shouldGetNullIfThereAreNoEmployeesInDepartment() {
        Department d = new Department("Teste");
        Assert.assertNull(d.getEmployees());
    }

    @Test
    public void shouldNotHaveNullValuesInGetEmployees() {
        Department d = new Department("Teste");

        for (int i = 0; i < 5; i++) {
            d.addEmployee(new Employee(i+1, "Teste", 10.00));
        }

        for (Employee employee : d.getEmployees()) {
            Assert.assertNotNull(employee);
        }
    }

    @Test
    public void shouldGetNumberOfEmployeesInDepartment() {
        Department d = new Department("Teste");

        for (int i = 0; i < 5; i++) {
            d.addEmployee(new Employee(i+1, "Teste", 10.00));
        }

        Assert.assertEquals(5, d.getNumberOfEmployees());
    }

    @Test
    public void shouldReturnNullIfEmployeeIdDoesNotExists() {
        Department d = new Department("Teste");
        Employee e = new Employee(1, "Teste", 10.00);
        d.addEmployee(e);

        Assert.assertNull(d.findEmployeeById(2));
    }

    @Test
    public void shouldReturnEmployeeIfEmployeeIdExists() {
        Department d = new Department("Teste");
        Employee e = new Employee(1, "Teste", 10.00);
        d.addEmployee(e);

        Assert.assertEquals(e, d.findEmployeeById(1));
    }

    @Test
    public void shouldReturnTheSumOfSalaries() {
        Department d = new Department("Teste");
        Employee e1 = new Employee(1, "Teste", 100.00);
        Employee e2 = new Employee(2, "Teste", 200.00);
        Employee e3 = new Employee(3, "Teste", 300.00);
        d.addEmployee(e1);
        d.addEmployee(e2);
        d.addEmployee(e3);

        Assert.assertEquals(600.00, d.getTotalSalary(), 0);
    }

    @Test
    public void shouldReturnTheAverageSalaries() {
        Department d = new Department("Teste");
        Employee e1 = new Employee(1, "Teste", 100.00);
        Employee e2 = new Employee(2, "Teste", 200.00);
        Employee e3 = new Employee(3, "Teste", 300.00);
        d.addEmployee(e1);
        d.addEmployee(e2);
        d.addEmployee(e3);

        Assert.assertEquals(200.00, d.getAverageSalary(), 0);
    }
}
