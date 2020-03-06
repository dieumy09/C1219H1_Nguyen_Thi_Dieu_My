package Controllers;

import Commons.ReadWriteCSV;
import Models.Customer;
import Exception.*;
import Sort.NameCustomerComparator;

import java.util.*;


public class CustomerController {
    private ReadWriteCSV readWriteCSV ;
    private List<Customer> arrayListCustomers ;


    public CustomerController() {
        readWriteCSV = new ReadWriteCSV();
        arrayListCustomers = new ArrayList<>();

    }

    public Customer addNewCustomers() {

        Customer customer = new Customer();

        customer.setIdCustomer(UUID.randomUUID().toString().replace("-", ""));

        while (true) {
            try {
                customer.setNameCustomer(ExceptionName.exceptionName());
                break;
            } catch (ExceptionName e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                customer.setNumberIDCard(ExceptionIDCard.exceptionIDCard());
                break;
            } catch (ExceptionIDCard e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                customer.setNumberIDCard(ExceptionBirthday.exceptionBirthday());
                break;
            } catch (ExceptionBirthday e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                customer.setGender(ExceptionGender.exceptionGender());
                break;
            } catch (ExceptionGender e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                customer.setEmailCustomer(ExceptionEmail.exceptionEmail());
                break;
            } catch (ExceptionEmail e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter Phone Number: ");
        Scanner scanner1 = new Scanner(System.in);
        customer.setPhoneNumber(scanner1.nextLine());

        System.out.println("Enter Type Customer: ");
        Scanner scanner2 = new Scanner(System.in);
        customer.setTypeCustomer(scanner2.nextLine());

        System.out.println("Enter Address: ");
        Scanner scanner3 = new Scanner(System.in);
        customer.setAddressCustomer(scanner3.nextLine());

        return customer;
    }


    public void addNewListCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number list customer you want: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            Customer customer = addNewCustomers();
            arrayListCustomers.add(customer);
        }
        readWriteCSV.writeCSVCustomer(arrayListCustomers);
    }

    public void showInfoCustomer() {
        List<Customer> arrayListCustomers = new ArrayList<>();
        arrayListCustomers = readWriteCSV.readCSVCustomer();
        Collections.sort(arrayListCustomers,new NameCustomerComparator());
        for (Customer customer : arrayListCustomers) {
            System.out.println(customer.showInfoCustomer());
        }

    }
}
