package Exception;

import java.time.LocalDate;
import java.util.Scanner;

public class ExceptionBirthday extends Exception {
    public ExceptionBirthday(String str){
        super(str);
    }
    public static String exceptionBirthday() throws ExceptionBirthday{
        System.out.print("Enter Birthday Customer (Format dd/MM/yyyy): ");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        LocalDate date = LocalDate.now();
        if (birthday.matches(regex)) {
            String temp = "";
            for (int i = birthday.length() - 4; i < birthday.length(); i++) {
                temp += birthday.charAt(i);
            }
            if (date.getYear() - new Integer(temp) >= 18 && new Integer(temp) > 1900) {
                return birthday;
            } else {
                throw new ExceptionBirthday("Birthday Invalid ");

            }
        } else {
            throw new ExceptionBirthday("Birthday Invalid ");
        }
    }
}
