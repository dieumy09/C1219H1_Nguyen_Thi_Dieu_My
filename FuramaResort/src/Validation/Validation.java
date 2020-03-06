package Validation;

import java.time.LocalDate;
import java.util.Scanner;

public class Validation {
    private static String regex;
    private static Scanner scanner;

    public Validation() {
        scanner = new Scanner(System.in);
    }

    public String checkNameService() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true){
            System.out.print("Enter name (Format: Abc Abc): ");
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("Service name is not valid");
            }
        }
    }

    public double checkAreaUse() {
        while (true){
            try {
                System.out.println("Enter Area Use: ");
                double area = scanner.nextDouble();
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("Fail, Please Input Again: ");
                }
            } catch (Exception e){
                System.out.println("Fail, Please Input Again: ");
            }

        }
    }

    public double checkPoolArea() {
        while (true){
            try {
                System.out.println("Enter Pool Area: ");
                double area = scanner.nextDouble();
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("Fail, Please Input Again: ");
                }
            } catch (Exception e){
                System.out.println("Fail, Please Input Again: ");
            }

        }
    }

    public double checkFeeRent() {
        while (true){
            try {
                System.out.println("Enter Fee Rent: ");
                double feeRent = scanner.nextDouble();
                if (feeRent > 0) {
                    return feeRent;
                } else {
                    System.out.println("Fail, Please Input Again: ");
                }
            } catch (Exception e) {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public int checkMaxNumberOfPeople() {
        while (true){
            try {
                System.out.println("Enter Max Number Of People: ");
                int maxNumberOfPeople = scanner.nextInt();
                if (maxNumberOfPeople > 0 && maxNumberOfPeople < 20) {
                    return maxNumberOfPeople;
                } else {
                    System.out.println("Fail, Please Input Again: ");
                }
            } catch (Exception e) {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public String checkDescription(){
        while (true){
            System.out.println("Enter Description");
            String description = scanner.nextLine();
            regex = "^massage$|^karaoke$|^food$|^drink$|^car$";
            if (description.matches(regex)) {
                return description;
            } else {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public String checkFreeService(){
        while (true){
            System.out.println("Enter Free Service: ");
            String freeService = scanner.nextLine();
            regex = "^massage$|^karaoke$|^food$|^drink$|^car$";
            if (freeService.matches(regex)) {
                return freeService;
            } else {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public int checkNumberOfFloor() {
        while (true){
            try {
                System.out.println("Enter Number Of Floor: ");
                int numberOfFloor = scanner.nextInt();
                if (numberOfFloor > 0) {
                    return numberOfFloor;
                } else {
                    System.out.println("Fail, Please Input Again: ");
                }
            } catch (Exception e) {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public String checkTypeOfRental() {
        Scanner scanner = new Scanner(System.in);
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true){
            System.out.println("Enter Type Of Rental: ");
            String typeOfRental = scanner.nextLine();
            if (typeOfRental.matches(regex)) {
                return typeOfRental;
            } else {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public String checkRoomStandard() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true){
            System.out.println("Enter Room Standard: ");
            String roomStandard = scanner.nextLine();
            if (roomStandard.matches(regex)) {
                return roomStandard;
            } else {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public String checkBirthday() {
        regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("Enter birthday (format dd/mm/yyyy): ");
            String birthday = scanner.nextLine();
            LocalDate date = LocalDate.now();

            if (birthday.matches(regex)) {
                String temp = "";
                for (int i = birthday.length() - 4; i < birthday.length(); i++) {
                    temp += birthday.charAt(i);
                }
                if (date.getYear() - new Integer(temp) >= 18) {
                    return birthday;
                } else {
                    System.out.println("Fail, Please Input Again: ");
                }
            } else {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

}
