package Models;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Services {
    public static void main(String[] args) throws IOException {
        List<List<String>> rows = Arrays.asList(
                Arrays.asList("Jean", "author", "Java"),
                Arrays.asList("David", "editor", "Python"),
                Arrays.asList("Scott", "editor", "Node.js")
        );

        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Role");
        csvWriter.append(",");
        csvWriter.append("Topic");
        csvWriter.append("\n");

        for (List<String> rowData : rows) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
//        csvWriter.close();

        System.out.println("File path: " + new File("new.csv").getAbsolutePath());

        String pathToCsv = new File("new.csv").getAbsolutePath();
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            System.out.println(data.length);
            System.out.println(data[0]);
        }
//        csvReader.close();
    }
}
