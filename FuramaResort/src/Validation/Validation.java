package Validation;

import java.util.Scanner;

public class Validation {
    private String regex="";
    private Scanner scanner;

    public String checkNameService() {
        regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        while (true){
            scanner = new Scanner(System.in);
            System.out.print("Enter name (Format: Abc Abc): ");
            String name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            } else {
                System.out.println("Service name is not valid");
            }
        }
    }

    public double checkAreaUseAndPoolArea() {
        while (true){
            try {
                scanner = new Scanner(System.in);
                double area = scanner.nextDouble();
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("Area Fail, Please Input Again: ");
                }
            } catch (Exception e){
                System.out.println("Area Fail, Please Input Again: ");
            }

        }
    }

    public double checkFeeRent() {
        while (true){
            try {
                scanner = new Scanner(System.in);
                double feeRent = scanner.nextDouble();
                if (feeRent > 0) {
                    return feeRent;
                } else {
                    System.out.println("FeeRent Fail, Please Input Again: ");
                }
            } catch (Exception e) {
                System.out.println("FeeRent Fail, Please Input Again: ");
            }
        }
    }

    public double checkMaxNumberOfPeople() {
        while (true){
            try {
                scanner = new Scanner(System.in);
                double maxNumberOfPeople = scanner.nextDouble();
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

    public String checkDescriptionAndFreeService(){
        while (true){
            scanner = new Scanner(System.in);
            String description = scanner.nextLine();
            if (description == "massage" || description == "karaoke" || description == "food" || description == "drink" || description == "car") {
                return description;
            } else {
                System.out.println("Fail, Please Input Again: ");
            }
        }
    }

    public double checkNumberOfFloor() {
        while (true){
            try {
                scanner = new Scanner(System.in);
                double numberOfFloor =
            }
        }
    }

}
