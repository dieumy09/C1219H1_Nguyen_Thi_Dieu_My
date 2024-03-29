package Models;

public class Customer implements Comparable<Customer>{
    private String idCustomer;
    private String nameCustomer;
    private String birthdayCustomer;
    private String gender;
    private String numberIDCard;
    private String phoneNumber;
    private String addressCustomer;
    private String typeCustomer;
    private String emailCustomer;
    private Services useService;


    public Customer(String idCustomer, String nameCustomer, String birthdayCustomer, String gender, String numberIDCard, String phoneNumber, String addressCustomer, String typeCustomer, String emailCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.gender = gender;
        this.numberIDCard = numberIDCard;
        this.phoneNumber = phoneNumber;
        this.addressCustomer = addressCustomer;
        this.typeCustomer = typeCustomer;
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getNameCustomer() {
        return this.nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return this.birthdayCustomer;
    }

    public Customer() {
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumberIDCard() {
        return this.numberIDCard;
    }

    public void setNumberIDCard(String numberIDCard) {
        this.numberIDCard = numberIDCard;
    }

    public String getEmailCustomer() {
        return this.emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getYearBirthday() {
        String temp = "";
        for (int i = getBirthdayCustomer().length() - 4; i < getBirthdayCustomer().length(); i++) {
            temp += getBirthdayCustomer().charAt(i);
        }
        return Integer.valueOf(temp);
    }

    public String showInfoCustomer() {
        return "Id:"  + idCustomer + "\n" +
                "Name Customer is: " + nameCustomer +
                "Birthday Customer is : " + birthdayCustomer + "\n" +
                "Gender Customer is: " + gender + "\n" +
                "ID Card Customer is: " + numberIDCard + "\n" +
                "Phone Number Customer: " + phoneNumber + "\n" +
                "Email Customer is: " + emailCustomer + "\n" +
                "Type Customer is: " + typeCustomer + "\n" +
                "Address Customer is: " + addressCustomer ;

    }

    @Override
    public String toString() {
        return "Id: " + idCustomer + "\n" +
                "Name Customer is: " + nameCustomer +
                "Birthday Customer is : " + birthdayCustomer + "\n" +
                "Gender Customer is: " + gender + "\n" +
                "ID Card Customer is: " + numberIDCard + "\n" +
                "Phone Number Customer: " + phoneNumber + "\n" +
                "Email Customer is: " + emailCustomer + "\n" +
                "Type Customer is: " + typeCustomer + "\n" +
                "Address Customer is: " + addressCustomer + "\n" +
                "Service is: " + useService + "\n";
    }

    public int getYearOfBirth() {
        String temp = "";
        for (int i = birthdayCustomer.length() - 4; i < birthdayCustomer.length(); i++) {
            temp += birthdayCustomer.charAt(i);
        }
        return new Integer(temp);
    }

    public int compareTo(Customer o) {
        if (nameCustomer.compareTo(o.getNameCustomer()) == 0){
            return getYearOfBirth() - o.getYearOfBirth();
        }
        return nameCustomer.compareTo(o.getNameCustomer());
    }
}
