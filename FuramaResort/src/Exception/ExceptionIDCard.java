package Exception;

import java.util.Scanner;

public class ExceptionIDCard extends Exception {
    public ExceptionIDCard(String str) {
        super(str);
    }


    public static String exceptionIDCard() throws ExceptionIDCard {
        System.out.println();
        System.out.print("Enter Id Card (Format XXX XXX XXX): ");
        Scanner scanner = new Scanner(System.in);
        String idCard = scanner.nextLine();
        String regex="^\\d{3}\\s\\d{3}\\s\\d{3}$";
        if (idCard.matches(regex)) {
            return idCard;
        } else {
            throw new ExceptionIDCard("ID Invalid");
        }
    }

}
