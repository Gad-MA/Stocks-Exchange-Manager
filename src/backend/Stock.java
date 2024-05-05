package backend;


/*
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Stock {
    String label;
    double price;
    int ownerId;
    ArrayList<Double> priceHistory;
    String csvLocation;

    Stock() {
    }

    Stock(String label, double price, int ownerId) {
        this.label = label;
        this.price = price;
        this.ownerId = ownerId;
        csvLocation = "data/" + label + "PriceHistory.csv";
        try {
            priceHistory = loadFromCSV();
        } catch (Exception e) {
            priceHistory.add(price);
            saveToCSV();
        }
        StocksDB.stocks.add(this);
        StocksDB.saveToCSV();
    }

    void changeOwner(int newOwnerId) {
    }

    void changePrice(double newPrice) {
        price = newPrice;
        priceHistory.add(price);
        saveToCSV();
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

    @Override
    public String toString() {
        return label + " " + price + " " + ownerId;
    }
}
