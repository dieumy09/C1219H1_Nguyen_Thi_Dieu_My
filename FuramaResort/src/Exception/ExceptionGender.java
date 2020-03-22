package Exception;

import java.util.Scanner;

public class ExceptionGender extends Exception {
    public ExceptionGender (String str) {
        super(str);
    }

    public static String exceptionGender() throws ExceptionGender {
        System.out.print("Enter Gender (male, female): ");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
        String regex="^male$|^female$";
        gender=gender.toLowerCase();
        if (gender.matches(regex)) {
            return gender;
        } else {
            throw new ExceptionGender("Gender Invalid");
        }

    }
}
