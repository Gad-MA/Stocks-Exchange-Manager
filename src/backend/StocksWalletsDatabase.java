package backend;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StocksWalletsDatabase implements Serializable {
    private static final long serialVersionUID = 1L;

    public Map<String, StocksWallet> wallets;
    private static StocksWalletsDatabase obj = null;
    private String filename = "wallets.dat";

    private StocksWalletsDatabase() {
        wallets = loadWallets();
    }

    public static StocksWalletsDatabase getInstance(){
        if(obj==null){
            obj = new StocksWalletsDatabase();
            return obj;
        }
        return obj;
    }

    private Map<String, StocksWallet> loadWallets() {
        File file = new File(filename);
        if (!file.exists()) {
            return new HashMap<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Map<String, StocksWallet>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading wallets: " + e.getMessage());
            return new HashMap<>();
        }
    }

    public void saveWallets() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(wallets);
        } catch (IOException e) {
            System.out.println("Error saving wallets: " + e.getMessage());
        }
    }

    public void addWallet(String username, StocksWallet wallet) {
        wallets.put(username, wallet);
        saveWallets();
    }

    public StocksWallet getWallet(String username) {
        return wallets.get(username);
    }

    public void printWallets() {
        System.out.println("Stocks Wallets Database:");
        for (Map.Entry<String, StocksWallet> entry : wallets.entrySet()) {
            String username = entry.getKey();
            StocksWallet wallet = entry.getValue();
            System.out.println("Username: " + username);
            System.out.println("Stocks:");
            for (Map.Entry<String, Integer> stockEntry : wallet.getStocksOwned().entrySet()) {
                String stockSymbol = stockEntry.getKey();
                int quantity = stockEntry.getValue();
                System.out.println(stockSymbol + ": " + quantity);
            }
            System.out.println();
        }
    }

}
