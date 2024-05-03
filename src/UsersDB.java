import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UsersDB {
    static String DBLocation = "data/users.csv";
    public static ArrayList<User> users;

    public static void initialize(){
        users = loadFromCSV();
    }

    public static void saveToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DBLocation))) {
            for (User user : users) {
                StringBuilder sb = new StringBuilder();
                // sb.append(user.name).append(",");
                sb.append(user.id).append(",");
                sb.append(user.username).append(",");
                sb.append(user.password).append(",");
                writer.write(sb.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> loadFromCSV() {
        ArrayList<User> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DBLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                User user = new User();
                user.id = Integer.parseInt(fields[0]);
                user.username = fields[1];
                user.password = fields[2];
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