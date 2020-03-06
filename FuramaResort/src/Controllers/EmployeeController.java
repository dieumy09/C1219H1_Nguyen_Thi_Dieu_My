package Controllers;

import Models.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeController {
    private static Map<String, Employee> employeeMap;

    static {
        employeeMap = new HashMap<>();
        employeeMap.put("001", new Employee("001","Nguyen Thi Dieu My","Quang Nam",23));
        employeeMap.put("002", new Employee("002","Nguyen Huu Tho","Quang Tri",21));
        employeeMap.put("003", new Employee("003","Phan Thi My Tinh","Da Nang",25));
        employeeMap.put("004", new Employee("004","Tran Van Thuan","Da Nang",21));
        employeeMap.put("005", new Employee("005","Nguyen Ha Nguyen","Da Nang",22));
        employeeMap.put("006", new Employee("006","Pham Anh Thien","Da Nang",25));
        employeeMap.put("007", new Employee("007","Le Thanh Tung","Da Nang",30));
        employeeMap.put("008", new Employee("008","Phan Minh Huy","Da Nang",21));
        employeeMap.put("009", new Employee("009","Tran Quang Trung ","Da Nang",25));
        employeeMap.put("010", new Employee("010","Dinh Vu Anh Tuan","Da Nang",24));
    }

    public List<Employee> getListEmployee() {

        return new ArrayList<>(employeeMap.values());
    }
     public void showInfoEmployee() {
        List<Employee> employees = this.getListEmployee();
         for (Employee employee : employees) {
             System.out.println(".................................");
             System.out.println(employee);
         }
     }


}
