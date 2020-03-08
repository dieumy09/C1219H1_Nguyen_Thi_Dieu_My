package Models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    // Thua code
    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameServices, double areaUse, double feeRent, int maxNumberOfPeople, String typeOfRental, String freeService) {
        super(id, nameServices, areaUse, feeRent, maxNumberOfPeople, typeOfRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfor(){
        return "Room: " + '\n' +
                "Id: " + super.getId() + '\n' +
                "Name ServiceInterface: " + super.getNameServices() + '\n' +
                "Area​​ Use: " + super.getAreaUse() + '\n' +
                "Fee Rent: " + super.getFeeRent() + '\n' +
                "Max Number Of People: " + super.getMaxNumberOfPeople() + '\n' +
                "Type Of Rental: " + super.getTypeOfRental()+ '\n' +
                "Free Service: " + freeService + '\n' ;
    }
}
