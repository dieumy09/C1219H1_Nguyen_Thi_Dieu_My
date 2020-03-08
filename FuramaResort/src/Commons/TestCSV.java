package Commons;

import Models.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class TestCSV {
    public static void main(String[] args) throws IOException {
        ReadWriteCSV test = new ReadWriteCSV();

//        //Villa
//        List<Villa> arrayVilla = new ArrayList<>();
//        Villa a = new Villa("a1","a2",2,3,4,"a3","a4","a5",5,6);
//        arrayVilla.add(a);
//        Villa b = new Villa("b1","b2",1,2,3,"b3","b4","b5",4,5);
//        arrayVilla.add(b);
//
//        test.writeCSVVilla(arrayVilla);
//
//        test.readCSVVilla();
//        for (Villa villa : arrayVilla) {
//            System.out.println(villa.showInfor());
//        }
//
//        //House
//         List<House> arrayHouse = new ArrayList<>();
//        House c = new House("c1","c2",1,2,3,"c4","c5","c6",4);
//        arrayHouse.add(c);
//        House d = new House("d1","d2",9,8,7,"d3","d4","d5",5);
//        arrayHouse.add(d);
//
//        test.writeCSVHouse(arrayHouse);
//
//        test.readCSVHouse();
//        for (House house : arrayHouse) {
//            System.out.println(house.showInfor());
//        }
//
//
        //Room
        List<Room> arrayRoom = new ArrayList<>();
        Room e = new Room("e1","e2",1,2,3,"e3","e4");
        arrayRoom.add(e);
        Room f = new Room("f1","f2",4,5,6,"f3","f4");
        arrayRoom.add(f);

        test.writeCSVRoom(arrayRoom);

        test.readCSVRoom();
        for (Room room : arrayRoom) {
            System.out.println(room.showInfor());
        }
//
//
//        //Customer
//        List<Customer> arrayCustomer = new ArrayList<>();
//        Customer customer = new Customer("a","My","09/09/1997","female","123 123 123","1234","QN","Silver","a@gmail.com");
//        arrayCustomer.add(customer);
//        test.writeCSVCustomer(arrayCustomer);
//        test.readCSVCustomer();
//        for (Customer customer1 : arrayCustomer) {
//            System.out.println(customer1.showInfoCustomer());
//        }

        List<Employee> list = new ArrayList<>();
        list = test.readCSVEmployee();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
