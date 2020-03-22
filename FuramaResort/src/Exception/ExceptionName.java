package Exception;

import java.util.Scanner;

public class ExceptionName extends Exception {
    public ExceptionName(String str) {

        super(str);
    }

    public static String exceptionName() throws ExceptionName {
        System.out.print("Enter Name Customer (Format Abc Abc): ");
        Scanner scanner = new Scanner(System.in);
        String nameCustomer = scanner.nextLine();
        String regex = "^((\\p{Lu})(\\p{Ll}*))( (\\p{Lu})(\\p{Ll}*))*$";
        if (nameCustomer.matches(regex)) {
            return nameCustomer;
        } else {
            throw new ExceptionName("Name Invalid: ");
        }
    }

}
