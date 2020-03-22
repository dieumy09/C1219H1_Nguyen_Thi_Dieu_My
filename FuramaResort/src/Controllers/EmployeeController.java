package Controllers;

import Commons.ReadWriteCSV;
import Models.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeController {
    private  List<Employee> employeeList;
    private ReadWriteCSV readWriteCSV;

    public EmployeeController() {
        readWriteCSV = new ReadWriteCSV();
        employeeList = new ArrayList<>();
    }

     public void showInfoEmployee() {
         Map<String,Employee> employeeMap = new HashMap<>();
         employeeList = readWriteCSV.readCSVEmployee();
         for (Employee employee : employeeList) {
             employeeMap.put(employee.getIdEmployee(),employee);
         }
         for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
             System.out.println(entry.getKey() + " : " + entry.getValue().toString());
             System.out.println("...............................");
         }
     }


}
