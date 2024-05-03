
/*
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Stock {
    String label;
    User owner;
    double price;
    ArrayList<Double> priceHistory = new ArrayList<Double>();
    String csvLocation = "data/" + label + "priceHistory.csv";

    Stock(String label, double price, User owner) {
        this.label = label;
        this.price = price;
        this.owner = owner;
    }

    void changeOwner(User newOwner) {
    }

    void changePrice(double newPrice) {
        priceHistory.add(price);
        saveToCSV();
        price = newPrice;
    }

    void saveToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvLocation))) {
            for (Double x : priceHistory) {
                StringBuilder sb = new StringBuilder();
                sb.append(x).append(",");
                writer.write(sb.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ArrayList<Double> loadFromCSV() {
        ArrayList<Double> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(csvLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String x = fields[0];
                data.add(Double.parseDouble(x));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;

    }

}
