package Exception;

import java.util.Scanner;

public class ExceptionEmail extends Exception{
    public ExceptionEmail(String str) {
        super(str);
    }
    public static String exceptionEmail() throws ExceptionEmail {
        System.out.print("Enter Email (Format abc@abc.abc): ");
        Scanner scanner = new Scanner(System.in);
        String emailCustomer = scanner.nextLine();
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (emailCustomer.matches(regex)) {
            return emailCustomer;
        } else {
            throw new ExceptionEmail("Email Invalid");
        }
    }
}
