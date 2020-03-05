package Controllers;

import Commons.ReadWriteCSV;
import Models.Customer;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Pattern;

public class CustomerController {


    public CustomerController() {

    }

    public static void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        String checkNamePattern = "((^([A-z]{1}[a-z_àáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*[ ])*)*$)";
        String checkBirthday = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$";
        String checkEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        String checkIdCard = "^([0-9]{9})$";
        String checkGender = "^(male)|(female)|(unknow)$";

        // ID Customer

        String idCustomer = UUID.randomUUID().toString().replace("-", "");

        //Name Customer
        System.out.println("Input Name Customer: ");
        String nameCustomer = scanner.nextLine();
        while (!Pattern.matches(checkNamePattern, nameCustomer)) {
            System.out.println("Your Name Fail, Please Input Again");
            nameCustomer = scanner.nextLine();
        }

        //Birthday Customer
        System.out.println("Input BirthDay Customer: ");
        String birthdayCustomer = scanner.nextLine();
        while (!Pattern.matches(checkBirthday, birthdayCustomer)) {
            System.out.println("Your BirthDay Fail, Please Input Again");
            birthdayCustomer = scanner.nextLine();
        }

        // ID Card
        System.out.println("Input IdCard Customer: ");
        String numberIDCard = scanner.nextLine();
        while (!Pattern.matches(checkIdCard, nameCustomer)) {
            System.out.println("Your ID Card Fail, Please Input Again");
            numberIDCard = scanner.nextLine();
        }

        // Address Customer
        System.out.println("Input Address Customer: ");
        String addressCustomer = scanner.nextLine();

        //Email Customer
        System.out.println("Input Email Customer: ");
        String emailCustomer = scanner.nextLine();
        while (!Pattern.matches(checkEmail,emailCustomer)){
            System.out.println("Your Email Fail, Please Input Again");
            emailCustomer = scanner.nextLine();
        }

        //Gender Customer
        System.out.println("Input Gender Customer: ");
        String gender = scanner.nextLine().toLowerCase();
        while (!Pattern.matches(checkGender,gender)){
            System.out.println("Your Gender Fail (Male,Female,Unknown), Please Input Again");
            gender = scanner.nextLine().toLowerCase();
        }

        String[] arr = gender.split("");
        String gender1 = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                gender1 += arr[0].toUpperCase();
            } else {
                gender1 += arr[i];
            }
        }

        // Phone Number Customer
        System.out.println("Input Phone Number Customer: ");
        String phoneCustomer = scanner.nextLine();

        // Type Customer
        System.out.println("Input Type Customer: ");
        String typeCustomer = scanner.nextLine();

        Customer customer = new Customer(idCustomer,nameCustomer,birthdayCustomer,gender,numberIDCard,phoneCustomer,addressCustomer,typeCustomer,emailCustomer);

        ReadWriteCSV readWriteCSV = new ReadWriteCSV();
        List<Customer> arrayListCustomers = new ArrayList();
        arrayListCustomers.add(customer);
        readWriteCSV.writeCSVCustomer(arrayListCustomers);

    }

    public void showInfoCustomer() {
        ReadWriteCSV readWriteCSV = new ReadWriteCSV();
        List<Customer> arrayListCustomers = new ArrayList();
        arrayListCustomers = readWriteCSV.readCSVCustomer();
        for (Customer customer : arrayListCustomers) {
            System.out.println(customer.showInfoCustomer());
        }

    }
}
