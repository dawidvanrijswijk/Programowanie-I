package Programowanie.zaj5;

import java.util.HashSet;
import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private Set<Employee> employees = new HashSet<>();

    @Override
    public void add(Employee emp) {
        employees.add(emp);
    }

    @Override
    public void remove(Long id) {
        employees.removeIf(emp -> emp.getId().equals(id));
    }

    @Override
    public boolean exist() {
        return false;
    }

    @Override
    public boolean exist(Employee emp) {
       return employees.contains(emp);
    }

    @Override
    public int count() {
        return employees.size();
    }

}
