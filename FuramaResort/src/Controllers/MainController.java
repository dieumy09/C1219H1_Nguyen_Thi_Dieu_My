package Controllers;

import Commons.ReadWriteCSV;
import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import Sort.NameCustomerComparator;
import Views.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MainController {
    private ReadWriteCSV readWriteCSV;
    private Menu menu = new Menu();
    private CustomerController customerController;

    public MainController() {
        readWriteCSV = new ReadWriteCSV();
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
                customerController.addCustomer();
                displayMainMenu();
                break;
            }
            case 4: {
                customerController.showInfoCustomer();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showInformationEmployee();
                break;
            }
            case 7: {
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
                addListVillaService();
                break;
            }
            case 2: {
                addListHouseService();
                break;
            }
            case 3: {
                addListRoomService();
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

    //Dang Lam
    private void addListRoomService() {
        Scanner scanner = new Scanner(System.in);
        List<Room> rooms = new ArrayList<>();
        rooms = readWriteCSV.readCSVRoom();
        System.out.println("Enter number list room you want: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            Room room = new Room();


        }

    }

    private void addListHouseService() {
    }

    private void addListVillaService() {
    }

    private void menuShowService() {
        int choose = menu.showingServiceMenu();
        switch (choose) {
            case 1: {
                showVillaService();
                break;
            }
            case 2: {
                showHouseService();
                break;
            }
            case 3: {
                showRoomService();
                break;
            }
            case 4: {
                showAllNameVillaNotDuplicate();
                break;
            }
            case 5: {
                showAllNameHouseNotDuplicate();
                break;
            }
            case 6: {
                showAllNameRoomNotDuplicate();
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

    private void showAllNameRoomNotDuplicate() {
    }

    private void showAllNameHouseNotDuplicate() {
    }

    private void showAllNameVillaNotDuplicate() {
    }

    private void showRoomService() {
    }

    private void showHouseService() {
    }

    private void showVillaService() {
    }

    // Chua day vao file booking.csv
    private void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers;
        ReadWriteCSV readWriteCSV = new ReadWriteCSV();
        customers = readWriteCSV.readCSVCustomer();
        Collections.sort(customers, new NameCustomerComparator());
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("--------------------------------------------------");
            System.out.println((i + 1) + ". " + customers.get(i).showInfoCustomer());
        }
        int choose = menu.addingBookingMenu();
        Customer customer = customers.get(choose - 1);
        ReadWriteCSV readFileCSV = new ReadWriteCSV();


        switch (choose) {
            case 1: {
                List<Villa> villas;
                villas = readFileCSV.readCSVVilla();
                for (int i = 0; i < villas.size(); i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("No" + (i + 1));
                    System.out.println(villas.get(i).showInfor());
                }
                System.out.println("Enter choice booking villa: ");
                Villa villa = villas.get(scanner.nextInt() - 1);
                customer.setUseService(villa);
                break;
            }

            case 2: {
                List<House> houses;
                houses = readFileCSV.readCSVHouse();
                for (int i = 0; i < houses.size(); i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("No" + (i + 1));
                    System.out.println(houses.get(i).showInfor());
                }
                System.out.println("Enter choice booking villa: ");
                House house = houses.get(scanner.nextInt() - 1);
                customer.setUseService(house);
                break;
            }

            case 3: {
                List<Room> rooms;
                rooms = readFileCSV.readCSVRoom();
                for (int i = 0; i < rooms.size(); i++) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("No" + (i + 1));
                    System.out.println(rooms.get(i).showInfor());
                }
                System.out.println("Enter choice booking villa: ");
                Room room = rooms.get(scanner.nextInt() - 1);
                customer.setUseService(room);
                break;
            }
            default:{
                displayMainMenu();
            }

        }

    }

    private void showInformationEmployee() {

    }
}
