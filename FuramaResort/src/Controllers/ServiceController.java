package Controllers;

import Commons.ReadWriteCSV;
import Models.House;
import Models.Room;
import Models.Villa;
import Validation.Validation;
import apple.laf.JRSUIUtils;


import java.util.*;

public class ServiceController {
    private String setID = UUID.randomUUID().toString().replace("-","");
    private Scanner scanner;
    private ReadWriteCSV readWriteCSV;
    private List<Villa> villas;
    private List<House> houses;
    private List<Room> rooms;
    private Validation validation;

    public ServiceController() {
        scanner = new Scanner(System.in);
        readWriteCSV = new ReadWriteCSV();
        villas = readWriteCSV.readCSVVilla();
        houses = readWriteCSV.readCSVHouse();
        rooms = readWriteCSV.readCSVRoom();
        validation = new Validation();
    }


    public void addListVillaService() {
        List<Villa> villas = new ArrayList<>();
        System.out.println("Enter number list villa you want: ");
        int length = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            Villa villa = new Villa();

            villa.setId(setID);
            villa.setNameServices(validation.checkNameService());
            villa.setAreaUse(validation.checkAreaUse());
            villa.setFeeRent(validation.checkFeeRent());
            villa.setMaxNumberOfPeople(validation.checkMaxNumberOfPeople());
            villa.setMaxNumberOfPeople(validation.checkNumberOfFloor());
            villa.setTypeOfRental(validation.checkTypeOfRental());
            villa.setRoomStandard(validation.checkRoomStandard());
            villa.setDescription(validation.checkDescription());
            villa.setPoolArea(validation.checkPoolArea());
            System.out.println(".................................");
            villas.add(villa);
        }
        readWriteCSV.writeCSVVilla(villas);

    }

    public void addListHouseService()  {
        List<House> houses = new ArrayList<>();
        System.out.println("Enter number list house you want: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            House house = new House();

            house.setId(setID);
            house.setNameServices(validation.checkNameService());
            house.setAreaUse(validation.checkAreaUse());
            house.setFeeRent(validation.checkFeeRent());
            house.setMaxNumberOfPeople(validation.checkMaxNumberOfPeople());
            house.setTypeOfRental(validation.checkTypeOfRental());
            house.setRoomStandard(validation.checkRoomStandard());
            house.setDescription(validation.checkDescription());
            house.setNumberOfFloor(validation.checkNumberOfFloor());
            System.out.println(".................................");
            houses.add(house);
        }
        readWriteCSV.writeCSVHouse(houses);

    }

    public void addListRoomService()  {
        List<Room> rooms = new ArrayList<>();
        System.out.println("Enter number list room you want: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            Room room = new Room();

            room.setId(setID);
            room.setNameServices(validation.checkNameService());
            room.setAreaUse(validation.checkAreaUse());
            room.setFeeRent(validation.checkFeeRent());
            room.setMaxNumberOfPeople(validation.checkMaxNumberOfPeople());
            room.setTypeOfRental(validation.checkTypeOfRental());
            room.setFreeService(validation.checkFreeService());
            System.out.println(".................................");

            rooms.add(room);
        }
        readWriteCSV.writeCSVRoom(rooms);

    }

    public void showVillaService() {
        List<Villa> villas;
        villas = readWriteCSV.readCSVVilla();
        for (Villa villa : villas) {
            System.out.println(".................................");
            System.out.println(villa.showInfor());
        }
    }

    public void showHouseService() {
        List<House> houses;
        houses = readWriteCSV.readCSVHouse();
        for (House house : houses) {
            System.out.println(".................................");
            System.out.println(house.showInfor());
        }
    }

    public void showRoomService() {
        List<Room> rooms;
        rooms = readWriteCSV.readCSVRoom();
        for (Room room : rooms) {
            System.out.println(".................................");
            System.out.println(room.showInfor());
        }
    }

    public void showAllNameVillaNotDuplicate() {
        Set<Villa> setVilla = new TreeSet<>(villas);
        for (Villa villa : setVilla) {
            System.out.println(".................................");
            System.out.println(villa.getNameServices());
        }
    }

    public void showAllNameHouseNotDuplicate() {
        Set<House> setHouse = new TreeSet<>(houses);
        for (House house : setHouse) {
            System.out.println(".................................");
            System.out.println(house.getNameServices());
        }
    }

    public void showAllNameRoomNotDuplicate() {
        Set<Room> setRoom = new TreeSet<>(rooms);
        for (Room room : setRoom) {
            System.out.println(".................................");
            System.out.println(room.getNameServices());
        }
    }

}
