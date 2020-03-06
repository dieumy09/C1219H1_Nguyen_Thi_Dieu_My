package Controllers;

import Models.Customer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cinema4DController {
    private Scanner scanner;
    private Queue<Customer> customerQueue ;
    private CustomerController customerController;


    public Cinema4DController() {
        customerQueue = new LinkedList<>();
        customerController = new CustomerController();
    }

    public void bookingTicketCinema(){
        scanner = new Scanner(System.in);
        System.out.println("Enter maximum ticket: ");
        int numberOfTicket = scanner.nextInt();
        for (int i = 0; i < numberOfTicket; i++) {
            Customer customer = customerController.addNewCustomers();
            customerQueue.add(customer);
        }

    }

    public void showBookingCinema() {
        while (true) {
            Customer customer = customerQueue.poll();
            if (customer == null){
                break;
            } else {
                System.out.println(customer.showInfoCustomer());
            }
        }
    }


}
