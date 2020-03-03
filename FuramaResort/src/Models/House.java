package Models;

public class House extends Services {
    private String roomStandard;
    private String description;
    private int numberOfFloor;

    public House() {
    }

    public House(String roomStandard, String description, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.description = description;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String id, String nameServices, double areaUse, double feeRent, int maxNumberOfPeople, String typeOfRental, String roomStandard, String description, int numberOfFloor) {
        super(id, nameServices, areaUse, feeRent, maxNumberOfPeople, typeOfRental);
        this.roomStandard = roomStandard;
        this.description = description;
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

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor(){
        return "House: " + '\n' +
                "Id: " + super.getId() + '\n' +
                "Name ServiceInterface: " + super.getNameServices() + '\n' +
                "Area​​ Use: " + super.getAreaUse() + '\n' +
                "Fee Rent: " + super.getFeeRent() + '\n' +
                "Max Number Of People: " + super.getMaxNumberOfPeople() + '\n' +
                "Type Of Rental: " + super.getTypeOfRental()+ '\n' +
                "Room Standard: " + roomStandard + '\n' +
                "Convenient Description: " + description + '\n' +
                "Number Of Floors: " + numberOfFloor;
    }
}
