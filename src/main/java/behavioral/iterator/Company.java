package behavioral.iterator;

import behavioral.iterator.aggregator.Aggregate;

import java.util.List;

public class Company implements Aggregate<Employee> {
    private final List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}
