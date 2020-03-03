package Models;

public class Villa extends Services {
    private String roomStandard;
    private String description;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, String description, double poolArea, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String id, String nameServices, double areaUse, double feeRent, int maxNumberOfPeople, String typeOfRental, String roomStandard, String description, double poolArea, int numberOfFloor) {
        super(id, nameServices, areaUse, feeRent, maxNumberOfPeople, typeOfRental);
        this.roomStandard = roomStandard;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor(){
        return "Villa: " + '\n' +
                "Id: " + super.getId() + '\n' +
                "Name ServiceInterface: " + super.getNameServices() + '\n' +
                "Area​​ Use: " + super.getAreaUse() + '\n' +
                "Fee Rent: " + super.getFeeRent() + '\n' +
                "Max Number Of People: " + super.getMaxNumberOfPeople() + '\n' +
                "Type Of Rental: " + super.getTypeOfRental()+ '\n' +
                "Room Standard: " + roomStandard + '\n' +
                "Convenient Description: " + description + '\n' +
                "Area Pool: " + poolArea + '\n' +
                "Number Of Floors: " + numberOfFloor;
    }
}
