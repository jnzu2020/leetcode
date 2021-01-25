import java.util.*;

public class _0690_Employee_Importance {
    public static int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> emps = new HashMap<>();
        Queue<Employee> employeeQueue = new LinkedList<>();
        for (Employee employee : employees) {
            emps.put(employee.id, employee);
        }
        employeeQueue.add(emps.get(id));
        int result = 0;
        while (!employeeQueue.isEmpty()) {
            Employee employee = employeeQueue.remove();
            result += employee.importance;
            List<Integer> subordinates = employee.subordinates;
            for (int i : subordinates) {
                employeeQueue.add(emps.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> subordinates = new ArrayList<>();
        subordinates.add(2);
        subordinates.add(3);
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        employee1.subordinates = subordinates;
        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;
        employee2.subordinates = new ArrayList<>();
        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;
        employee3.subordinates = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(getImportance(employees, 1));
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
