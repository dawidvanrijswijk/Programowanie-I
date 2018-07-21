package Programowanie.zaj5;

public interface EmployeeService {
    public void add(Employee emp);
    public void remove(Long id);
    public boolean exist();

    boolean exist(Employee emp);

    int count();
}
