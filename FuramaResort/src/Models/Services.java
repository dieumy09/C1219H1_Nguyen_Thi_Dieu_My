package Models;

public abstract class Services {
    private String id;
    private String nameServices;
    private double areaUse;
    private double feeRent;
    private int maxNumberOfPeople;
    private String typeOfRental;

    public Services() {
    }

    public Services(String id, String nameServices, double areaUse, double feeRent, int maxNumberOfPeople, String typeOfRental) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUse = areaUse;
        this.feeRent = feeRent;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRental = typeOfRental;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getFeeRent() {
        return feeRent;
    }

    public void setFeeRent(double feeRent) {
        this.feeRent = feeRent;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeOfRental() {
        return typeOfRental;
    }

    public void setTypeOfRental(String typeOfRental) {
        this.typeOfRental = typeOfRental;
    }

    public abstract String showInfor();
}
