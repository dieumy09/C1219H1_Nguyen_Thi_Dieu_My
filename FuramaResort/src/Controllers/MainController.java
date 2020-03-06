package Controllers;

import Commons.ReadWriteCSV;
import Models.*;
import Sort.NameCustomerComparator;
import Views.Menu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MainController {

    private Menu menu = new Menu();
    private CustomerController customerController;
    private ServiceController serviceController;
    private EmployeeController employeeController;
    private Cinema4DController cinema4DController;
    private FilingCabinetController filingCabinetController;

    public MainController() {
        customerController = new CustomerController();
        serviceController = new ServiceController();
        employeeController = new EmployeeController();
        cinema4DController = new Cinema4DController();
        filingCabinetController = new FilingCabinetController();
    }

    public void displayMainMenu() {

        int chooseMainMenu = menu.mainMenu();
        switch (chooseMainMenu) {
            case 1: {
                menuAddNewService();
                break;
            }
            case 2: {
                menuShowService();
                break;
            }
            case 3: {
                customerController.addNewListCustomer();
                displayMainMenu();
                break;
            }
            case 4: {
                customerController.showInfoCustomer();
                displayMainMenu();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                employeeController.showInfoEmployee();
                displayMainMenu();
                break;
            }
            case 7: {
                cinema4DController.bookingTicketCinema();
                displayMainMenu();
            }
            case 8: {
                cinema4DController.showBookingCinema();
                displayMainMenu();
            }
            case 9: {
                filingCabinetController.searchInformationEmployee();
                displayMainMenu();
            }
            case 10: {
                System.exit(0);
            }
            default:
                displayMainMenu();
        }
    }


    private void menuAddNewService() {

        int choose = menu.addingServiceMenu();
        switch (choose) {
            case 1: {
                serviceController.addListVillaService();
                menuAddNewService();
                break;
            }
            case 2: {
                serviceController.addListHouseService();
                menuAddNewService();
                break;
            }
            case 3: {
                serviceController.addListRoomService();
                menuAddNewService();
                break;
            }

            case 4: {
                displayMainMenu();
                break;
            }
            default: {
                System.exit(0);
            }
        }
    }


    private void menuShowService() {
        int choose = menu.showingServiceMenu();
        switch (choose) {
            case 1: {
                serviceController.showVillaService();
                menuShowService();
                break;
            }
            case 2: {
                serviceController.showHouseService();
                menuShowService();
                break;
            }
            case 3: {
                serviceController.showRoomService();
                menuShowService();
                break;
            }
            case 4: {
                serviceController.showAllNameVillaNotDuplicate();
                menuShowService();
                break;
            }
            case 5: {
                serviceController.showAllNameHouseNotDuplicate();
                menuShowService();
                break;
            }
            case 6: {
                serviceController.showAllNameRoomNotDuplicate();
                menuShowService();
                break;
            }

            case 7: {
                displayMainMenu();
                break;
            }
            default: {
                System.exit(0);
            }
        }
    }


    private void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        ReadWriteCSV readWriteCSV = new ReadWriteCSV();
        customers = readWriteCSV.readCSVCustomer();
        Collections.sort(customers, new NameCustomerComparator());
        for (Customer customer : customers) {
            System.out.println(".................................");
            System.out.println(customers.indexOf(customer) + ": " + customer.showInfoCustomer());
        }

        System.out.println("Choose the customer: ");
        int choice = scanner.nextInt();
        Customer customer = null;
        if (choice < 0 || choice >= customers.size()) {
            System.out.println("No Customer!!!");
            addNewBooking();
        } else {
            customer = customers.get(choice);
        }


        ReadWriteCSV readFileCSV = new ReadWriteCSV();
        Services service = null;
        int choose = menu.addingBookingMenu();
        switch (choose) {
            case 1: {
                List<Villa> villas;
                villas = readFileCSV.readCSVVilla();
                for (int i = 0; i < villas.size(); i++) {
                    System.out.println(".................................");
                    System.out.println("No: " + i);
                    System.out.println(villas.get(i).showInfor());
                }
                System.out.println("Enter choice booking villa: ");
                int index = scanner.nextInt();
                Villa villa = villas.get(index);
                customer.setUseService(villa);
                service = villas.get(index);
                break;
            }
            case 2: {
                List<House> houses;
                houses = readFileCSV.readCSVHouse();
                for (int i = 0; i < houses.size(); i++) {
                    System.out.println(".................................");
                    System.out.println("No: " + i);
                    System.out.println(houses.get(i).showInfor());
                }
                System.out.println("Enter choice booking house: ");
                int index = scanner.nextInt();
                House house = houses.get(index);
                customer.setUseService(house);
                service = houses.get(index);
                break;
            }
            case 3: {
                List<Room> rooms;
                rooms = readFileCSV.readCSVRoom();
                for (int i = 0; i < rooms.size(); i++) {
                    System.out.println(".................................");
                    System.out.println("No: " + i);
                    System.out.println(rooms.get(i).showInfor());
                }
                System.out.println("Enter choice booking room: ");
                int index = scanner.nextInt();
                Room room = rooms.get(index);
                customer.setUseService(room);
                service = rooms.get(index);
                break;
            }
            default: {
                displayMainMenu();
            }

        }
        List<Booking> arrayListBooking = new ArrayList<>();
        Booking booking = new Booking();
        booking.setIdCustomer(customer.getIdCustomer());
        booking.setCustomerName(customer.getNameCustomer());
        booking.setIdService(service.getId());
        booking.setServiceName(service.getNameServices());
        arrayListBooking.add(booking);
        readWriteCSV.writeCSVBooking(arrayListBooking);
        displayMainMenu();


    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }

}
