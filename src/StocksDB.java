import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StocksDB {
    static String DBLocation = "data/stocks.csv";
    public static ArrayList<Stock> stocks;

    public static void initialize(){
        stocks = loadFromCSV();
    }

    public static void saveToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DBLocation))) {
            for (Stock stock : stocks) {
                StringBuilder sb = new StringBuilder();
                sb.append(stock.label).append(",");
                sb.append(stock.price).append(",");
                sb.append(stock.ownerId).append(",");
                writer.write(sb.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Stock> loadFromCSV() {
        ArrayList<Stock> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DBLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                Stock stock = new Stock();
                stock.label = fields[0];
                stock.price = Double.parseDouble(fields[1]);
                stock.ownerId = Integer.parseInt(fields[2]);
                data.add(stock);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;

    }

    public static void print(){
        for(Stock u : stocks){
            System.out.println(u);
        }
    }
}
