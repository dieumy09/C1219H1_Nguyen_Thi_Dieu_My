package Controllers;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("1. Add New Services\n" +
                "2. Show Services\n" +
                "3. Add New Customer\n" +
                "4. Show Information Customer\n" +
                "5. Add New Booking Resort\n" +
                "6. Show Information Employee\n" +
                "7. Exit");
        System.out.print("Input your choice: ");
        int chooseMainMenu = scanner.nextInt();
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
                addNewCustomer();
                break;
            }
            case 4: {
                showInfoCustomer();
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
            case 7:{
                System.exit(0);
            }
            default:
                displayMainMenu();
        }
    }

    private void menuAddNewService(){
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        System.out.print("Input your choice: ");
        int choose = scanner.nextInt();
        switch (choose){
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

    private void addListRoomService() {
    }

    private void addListHouseService() {
    }

    private void addListVillaService() {
    }

    private void menuShowService(){
        System.out.println("1. Show All Villa\n" +
                "2. Show All House\n" +
                "3. Show All Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Room Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");
        int choose = scanner.nextInt();
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

    private void addNewCustomer() {

    }

    private void showInfoCustomer() {

    }

    private void addNewBooking() {

    }

    private void showInformationEmployee(){

    }
}
