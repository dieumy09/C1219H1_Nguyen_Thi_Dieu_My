package Controllers;

import Models.Employee;

import java.util.Scanner;
import java.util.Stack;

public class FilingCabinetController {
    private static Stack<Employee> employeeStack ;

    public FilingCabinetController() {
    }


    static {
        employeeStack = new Stack<>();
        employeeStack.push(new Employee("001","Nguyen Thi Dieu My","Quang Nam",23));
        employeeStack.push(new Employee("002","Nguyen Huu Tho","Quang Tri",21));
        employeeStack.push(new Employee("003","Phan Thi My Tinh","Da Nang",25));
        employeeStack.push(new Employee("004","Tran Van Thuan","Da Nang",21));
        employeeStack.push(new Employee("005","Nguyen Ha Nguyen","Da Nang",22));
        employeeStack.push(new Employee("006","Pham Anh Thien","Da Nang",25));
        employeeStack.push(new Employee("007","Le Thanh Tung","Da Nang",30));
        employeeStack.push(new Employee("008","Phan Minh Huy","Da Nang",21));
        employeeStack.push(new Employee("009","Tran Quang Trung ","Da Nang",25));
        employeeStack.push(new Employee("010","Dinh Vu Anh Tuan","Da Nang",24));

    }
    public Employee findEmployeeById(String id) {

        while (true) {
            Employee employee=employeeStack.pop();
            if(employee==null) {
                break;
            }
            if(id.equals(employee.getIdEmployee())) {
                return employee;
            }
        }
        return null;
    }

    public void searchInformationEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id of Employee: ");
        String idEmployee = scanner.nextLine();
        Employee employee = findEmployeeById(idEmployee);
        if (employee == null) {
            System.out.println("Not found Filing Cabinets!");
        } else {
            System.out.println(".................................");
            System.out.println(employee);
            System.out.println(".................................");
        }
    }
}
