package backend;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UsersDatabase implements Serializable { // Used the singleton design pattern for any easy passing of the
                                                     // Database object around
    private static final long serialVersionUID = 1L;

    private Map<String, User> users;
    private String filename = "users.dat";
    private static UsersDatabase obj = null;

    private UsersDatabase() {
        this.users = loadUsers();
    }

    public static UsersDatabase getInstance() {
        if (obj == null) {
            obj = new UsersDatabase();
            return obj;
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    private Map<String, User> loadUsers() {
        File file = new File(filename);
        if (!file.exists()) {
            return new HashMap<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Map<String, User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading users: " + e.getMessage());
            return new HashMap<>();
        }
    }

    public void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.out.println("Error saving users: " + e.getMessage());
        }
    }

    public void removeUser(String username) {
        users.remove(username);
    }

    public Map<String, User> getUsersHashmap(){
        return users;
    }

    public void addUser(String username, String password, boolean isAdmin) {
        if (!isAdmin)
            users.put(username, new User(username, password));
        else
            users.put(username, new Admin(username, password));
        saveUsers();
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public void printUsers() {
        System.out.println("Users Database:");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            User user = entry.getValue();
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            String className = user.getClass().getSimpleName();
            System.out.println("is Admin?: " + (className.equals("Admin")? "yes":"no"));
            System.out.println("Stocks:");
            // for (Map.Entry<String, Integer> stockEntry :
            // user.getStocksWallet().getStocksOwned().entrySet()) {
            // String stock = stockEntry.getKey();
            // int quantity = stockEntry.getValue();
            // System.out.println(stock + ": " + quantity);
            // }
            System.out.println();
        }
    }

    public User login(String username, String password) {
        if (search(username) && users.get(username).getPassword().equals(password))
            return users.get(username);
        return null;
    }

    public boolean search(String username) {
        if (users.containsKey(username))
            return true;
        return false;
    }

    public boolean register(String username, String password, boolean isAdmin) {
        if (search(username))
            return false;
        addUser(username, password, isAdmin);
        return true;
    }

}