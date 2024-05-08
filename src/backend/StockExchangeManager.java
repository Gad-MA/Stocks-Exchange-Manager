package backend;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StockExchangeManager {
    public static void main(String[] args) {
        String usersFile = "users.dat";
        String stocksFile = "stocks.dat";
        String walletsFile = "wallets.dat";

        // Initialize databases
        UsersDatabase usersDatabase = new UsersDatabase(usersFile);
        StocksDatabase stocksDatabase = new StocksDatabase(stocksFile);
        StocksWalletsDatabase walletsDatabase = new StocksWalletsDatabase(walletsFile);
        walletsDatabase.getWallet("user1").addStock("AAPL", 5);

        usersDatabase.printUsers();
        stocksDatabase.printStocks();
        walletsDatabase.printWallets();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                usersDatabase.saveUsers();
                stocksDatabase.saveStocks();
                walletsDatabase.saveWallets();
            }
        });
    }
}
