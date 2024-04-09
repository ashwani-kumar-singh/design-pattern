package behavioral.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeIterator implements Iterator<Employee> {
    private int currIndex = 0;
    private List<Employee> employees;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Employee next() {
        if (hasNext()) {
            return employees.get(currIndex++);
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean hasNext() {
        return currIndex < employees.size();
    }
}
