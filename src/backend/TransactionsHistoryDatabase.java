package backend;

import java.io.*;
import java.util.ArrayList;

/**
 * TransactionsHistory
 */
public class TransactionsHistoryDatabase implements Serializable{
    private static final long serialVersionUID = 1L;

    private static String filename = "transactions.dat";
    private ArrayList<Transaction> transactions;
    private static TransactionsHistoryDatabase obj = null;

    private TransactionsHistoryDatabase() {
        transactions = loadTransactions();
    }

    public static TransactionsHistoryDatabase getInstance() {
        if (obj == null) {
            obj = new TransactionsHistoryDatabase();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Transaction> loadTransactions() {
        File file = new File(filename);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (ArrayList<Transaction>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading transactions: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void saveTransactions() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(transactions);
        } catch (IOException e) {
            System.out.println("Error saving transactions: " + e.getMessage());
        }
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.printf("%s bought %d %s from %s", transaction.getNewOwner(), transaction.getQuantity(),
                    transaction.getStockSymbol(), transaction.getOldOwner());
        }
    }
}