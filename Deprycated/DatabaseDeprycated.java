
import java.io.*;
import java.util.ArrayList;

public class Database {

    static ArrayList<User> users;

    public static void initialize() {
        users = loadFromCSV("users.csv");
    }
    // static ArrayList<Stock> Stocks = new ArrayList<Stock>();

    public static void printDB() {
        for (User u : Database.users) {
            System.out.printf("username: %s\npassword %s \n \n", u.username, u.password);
        }

    }

    public static void saveToCSV(ArrayList<User> data, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : data) {
                StringBuilder sb = new StringBuilder();
                // sb.append(user.name).append(",");
                sb.append(user.username).append(",");
                sb.append(user.password).append(",");
                // sb.append(user.stocksWallet.getBalance()).append(",");
                // sb.append(user.cashWallet.getBalance());
                writer.write(sb.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> loadFromCSV(String fileName) {
        ArrayList<User> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                User user = new User();
                // user.name = fields[0];
                user.username = fields[0];
                user.password = fields[1];
                // user.stocksWallet = new StocksWallet(Double.parseDouble(fields[3]));
                // user.cashWallet = new CashWallet(Double.parseDouble(fields[4]));
                data.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
