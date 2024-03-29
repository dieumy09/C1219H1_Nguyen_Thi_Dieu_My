package Commons;

import Models.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadWriteCSV {
    private final String[] VILLA_HEADER = {"id", "nameServices", "areaUse", "typeOfRental", "feeRent", "maxNumberOfPeople", "description", "roomStandard", "numberOfFloor", "poolArea"};
    private final String[] HOUSE_HEADER = {"id", "nameServices", "areaUse", "typeOfRental", "feeRent", "maxNumberOfPeople", "description","roomStandard", "numberOfFloor"};
    private final String[] ROOM_HEADER = {"id", "nameServices", "areaUse", "typeOfRental", "feeRent", "maxNumberOfPeople","freeService"};
    private final String[] CUSTOMER_HEADER = {"idCustomer", "nameCustomer", "birthdayCustomer", "gender", "numberIDCard", "phoneNumber", "emailCustomer","typeCustomer", "addressCustomer"};
    private final String[] BOOKING_HEADER = {"idCustomer","customerName","idService","serviceName"};
    private final String[] EMPLOYEE_HEADER = {"idEmployee","nameEmployee","addressEmployee","ageEmployee"};

    private final char COMMA_DELIMITER = ',';
    private final char DEFAULT_QUOTE = '"';
    private final String NEW_LINE_SEPARATOR = "\n";
    private final int NUM_OF_LINE_SKIP = 1;

    private final String PATH_FILE_VILLA = "src/Data/Villa.csv";
    private final String PATH_FILE_HOUSE = "src/Data/House.csv";
    private final String PATH_FILE_ROOM = "src/Data/Room.csv";
    private final String PATH_FILE_CUSTOMER = "src/Data/Customer.csv";
    private final String PATH_FILE_BOOKING = "src/Data/Booking.csv";
    private final String PATH_FILE_EMPLOYEE = "src/Data/Employee.csv";


// Write and Read Villa
    public void writeCSVVilla(List<Villa> villas) {
        CSVWriter writer = null;
        List<String[]> allData = new ArrayList<>();
        try {

            writer = new CSVWriter(new FileWriter(PATH_FILE_VILLA), COMMA_DELIMITER, DEFAULT_QUOTE, NEW_LINE_SEPARATOR);
            writer.writeNext(VILLA_HEADER);
            for (Villa villa : villas) {
                String[] temp = new String[]{
                        villa.getId(),
                        villa.getNameServices(),
                        villa.getAreaUse()+"",
                        villa.getTypeOfRental(),
                        villa.getFeeRent()+"",
                        villa.getMaxNumberOfPeople()+"",
                        villa.getDescription(),
                        villa.getRoomStandard(),
                        villa.getNumberOfFloor()+"",
                        villa.getPoolArea()+""
                };
                allData.add(temp);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.writeAll(allData);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public List<Villa> readCSVVilla() {
        CSVReader reader = null;
        try {
            Map<String,String> map = new HashMap<>();
            for (String v : VILLA_HEADER) {
                map.put(v,v);
            }
            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(Villa.class);
            strategy.setColumnMapping(map);
            reader = new CSVReader(new FileReader(PATH_FILE_VILLA));
            CsvToBean<Villa> csvToBean = new CsvToBean<Villa>();
            List<Villa> list = csvToBean.parse(strategy,reader);
            return list;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    // Write and Read House
    public void writeCSVHouse(List<House> houses) {
        CSVWriter writer = null;
        List<String[]> allData = new ArrayList<>();
        try {

            writer = new CSVWriter(new FileWriter(PATH_FILE_HOUSE), COMMA_DELIMITER, DEFAULT_QUOTE, NEW_LINE_SEPARATOR);
            writer.writeNext(HOUSE_HEADER);
            for (House house : houses) {
                String[] temp = new String[]{
                        house.getId()+"",
                        house.getNameServices()+"",
                        house.getAreaUse()+"",
                        house.getTypeOfRental()+"",
                        house.getFeeRent()+"",
                        house.getMaxNumberOfPeople()+"",
                        house.getDescription()+"",
                        house.getRoomStandard()+"",
                        house.getNumberOfFloor()+""
                };
                allData.add(temp);
            }


            } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.writeAll(allData);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public List<House> readCSVHouse() {
        CSVReader reader = null;
        try {
            Map<String,String> map = new HashMap<>();
            for (String h : HOUSE_HEADER) {
                map.put(h,h);
            }

            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(House.class);
            strategy.setColumnMapping(map);
            reader = new CSVReader(new FileReader(PATH_FILE_HOUSE));
            CsvToBean<House> csvToBean = new CsvToBean<House>();
            List<House> list = csvToBean.parse(strategy,reader);

            return list;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

// Write and Read Room
public void writeCSVRoom(List<Room> rooms) {
    CSVWriter writer = null;
    List<String[]> allData = new ArrayList<>();
    try {
        writer = new CSVWriter(new FileWriter(PATH_FILE_ROOM), COMMA_DELIMITER, DEFAULT_QUOTE, NEW_LINE_SEPARATOR);
        writer.writeNext(ROOM_HEADER);
        for (Room room : rooms) {
            String[] temp = new String[]{
                    room.getId()+"",
                    room.getNameServices()+"",
                    room.getAreaUse()+"",
                    room.getTypeOfRental()+"",
                    room.getFeeRent()+"",
                    room.getMaxNumberOfPeople()+"",
                    room.getFreeService()+""
            };
            allData.add(temp);
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    finally {
        try {
            writer.writeAll(allData);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

    public List<Room> readCSVRoom() {
        CSVReader reader = null;
        try {
            Map<String,String> map = new HashMap<>();
            for (String r : ROOM_HEADER) {
                map.put(r,r);
            }

            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(Room.class);
            strategy.setColumnMapping(map);
            reader = new CSVReader(new FileReader(PATH_FILE_ROOM));
            CsvToBean<Room> csvToBean = new CsvToBean<Room>();
            List<Room> list = csvToBean.parse(strategy,reader);

            return list;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

// Write and Read Customer

    public void writeCSVCustomer(List<Customer> customers) {
        CSVWriter writer = null;
        List<String[]> allData = new ArrayList<>();
        try {
            writer = new CSVWriter(new FileWriter(PATH_FILE_CUSTOMER), COMMA_DELIMITER, DEFAULT_QUOTE, NEW_LINE_SEPARATOR);
            writer.writeNext(CUSTOMER_HEADER);
            for (Customer customer : customers) {
                String[] temp = new String[]{
                        customer.getIdCustomer()+"",
                        customer.getNameCustomer()+"",
                        customer.getBirthdayCustomer()+"",
                        customer.getGender()+"",
                        customer.getNumberIDCard()+"",
                        customer.getPhoneNumber()+"",
                        customer.getEmailCustomer()+"",
                        customer.getTypeCustomer()+"",
                        customer.getAddressCustomer()+""
                };
                allData.add(temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.writeAll(allData);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public List<Customer> readCSVCustomer() {
        CSVReader reader = null;
        try {
            Map<String,String> map = new HashMap<>();
            for (String r : CUSTOMER_HEADER) {
                map.put(r,r);
            }

            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(Customer.class);
            strategy.setColumnMapping(map);
            reader = new CSVReader(new FileReader(PATH_FILE_CUSTOMER));
            CsvToBean<Customer> csvToBean = new CsvToBean<Customer>();
            List<Customer> list = csvToBean.parse(strategy,reader);

            return list;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

 // Write And Read Booking
 public void writeCSVBooking(List<Booking> bookings) {
     CSVWriter writer = null;
     List<String[]> allData = new ArrayList<>();
     try {
         writer = new CSVWriter(new FileWriter(PATH_FILE_BOOKING), COMMA_DELIMITER, DEFAULT_QUOTE, NEW_LINE_SEPARATOR);
         writer.writeNext(BOOKING_HEADER);
         for (Booking booking : bookings) {
             String[] temp = new String[]{
                     booking.getIdCustomer()+"",
                     booking.getCustomerName()+"",
                     booking.getIdService()+"",
                     booking.getServiceName()+""
             };
             allData.add(temp);
         }

     } catch (IOException e) {
         e.printStackTrace();
     }
     finally {
         try {
             writer.writeAll(allData);
             writer.close();
         } catch (IOException e) {
             e.printStackTrace();
         }

     }

 }

    public List<Booking> readCSVBooking() {
        CSVReader reader = null;
        try {
            Map<String,String> map = new HashMap<>();
            for (String r : BOOKING_HEADER) {
                map.put(r,r);
            }

            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(Booking.class);
            strategy.setColumnMapping(map);
            reader = new CSVReader(new FileReader(PATH_FILE_BOOKING));
            CsvToBean<Booking> csvToBean = new CsvToBean<Booking>();
            List<Booking> list = csvToBean.parse(strategy,reader);

            return list;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }


    // Write and Read Employee
    public void writeCSVEmployee(List<Employee> employees) {
        CSVWriter writer = null;
        List<String[]> allData = new ArrayList<>();
        try {
            writer = new CSVWriter(new FileWriter(PATH_FILE_EMPLOYEE), COMMA_DELIMITER, DEFAULT_QUOTE, NEW_LINE_SEPARATOR);
            writer.writeNext(EMPLOYEE_HEADER);
            for (Employee employee : employees) {
                String[] temp = new String[]{
                        employee.getIdEmployee()+"",
                        employee.getNameEmployee()+"",
                        employee.getAddressEmployee()+"",
                        employee.getAgeEmployee()+""
                };
                allData.add(temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.writeAll(allData);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public List<Employee> readCSVEmployee() {
        CSVReader reader = null;
        try {
            Map<String,String> map = new HashMap<>();
            for (String r : EMPLOYEE_HEADER) {
                map.put(r,r);
            }
            HeaderColumnNameTranslateMappingStrategy strategy = new HeaderColumnNameTranslateMappingStrategy();
            strategy.setType(Employee.class);
            strategy.setColumnMapping(map);
            reader = new CSVReader(new FileReader(PATH_FILE_EMPLOYEE));
            CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
            List<Employee> list = csvToBean.parse(strategy,reader);


            return list;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

}
