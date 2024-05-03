import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UsersDB {
    public static ArrayList<User> users;

    public static void initialize(){
        users = loadFromCSV("users.csv");
    }

    public static void saveToCSV(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
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

    public static void print(){
        for(User u : users){
            System.out.println(u);
        }
    }
}