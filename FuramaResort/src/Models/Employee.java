package Models;

public class Employee {
    private String idEmployee;
    private String nameEmployee;
    private String addressEmployee;
    private int ageEmployee;

    public Employee() {
    }

    public Employee(String idEmployee, String nameEmployee, String addressEmployee, int ageEmployee) {
        this.nameEmployee = nameEmployee;
        this.addressEmployee = addressEmployee;
        this.idEmployee = idEmployee;
        this.ageEmployee = ageEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }


    @Override
    public String toString() {
        return "Employee:" + "\n" +
                "idEmployee= " + idEmployee + "\n" +
                "nameEmployee= " + nameEmployee + "\n" +
                "age= " + ageEmployee + "\n"+
                "address= " + addressEmployee + "\n" ;
    }
}
