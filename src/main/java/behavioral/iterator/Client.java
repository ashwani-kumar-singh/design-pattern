package behavioral.iterator;

import behavioral.iterator.aggregator.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterator: It provides a way to access the elements of an aggregate object (such as a list or
 * collection) sequentially without exposing its underlying representation.
 *
 * @link: <a href="https://www.geeksforgeeks.org/iterator-pattern/">...</a>
 */
public class Client {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 70000));

        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext()) {
            totalSalary += iterator.next().getSalary();
        }
        System.out.println("Total salary: " + totalSalary);
    }
}
