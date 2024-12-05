public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("Alice", "Smith", "111-11-1111", 10000, 10);
        employees[1] = new BasePlusCommissionEmployee("Bob", "Johnson", "222-22-2222", 8000, 15, 2000);
        employees[2] = new HourlyEmployee("Charlie", "Williams", "333-33-3333", 20, 40);
        employees[3] = new SalariedEmployee("David", "Brown", "444-44-4444", 1000);
        employees[4] = new CommissionEmployee("Eve", "Jones", "555-55-5555", 12000, 12);

        Employee maxSalaryEmployee = findMaxSalary(employees);
        if (maxSalaryEmployee != null) {
            System.out.println("Employee with the maximum salary: " + maxSalaryEmployee);
        } else {
            System.out.println("No employees found.");
        }
    }

    public static Employee findMaxSalary(Employee[] col) {
        if (col == null || col.length == 0) {
            return null;
        }

        Employee maxSalaryEmployee = null;
        for (Employee employee : col) {
            if (employee != null && (maxSalaryEmployee == null || employee.getPayment() > maxSalaryEmployee.getPayment())) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }
}