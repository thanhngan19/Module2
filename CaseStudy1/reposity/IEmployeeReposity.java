package CaseStudy1.reposity;

import CaseStudy1.model.Employee;

import java.util.ArrayList;

public interface IEmployeeReposity {
    ArrayList<Employee> findAll();
    int getSize();
    ArrayList<Employee> readFromFile(ArrayList<Employee> Employee, String path);
}
