import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:Database/database.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void insert(String tableName, User x) {
        String sql = "INSERT INTO " + tableName + "(name, capacity) VALUES(?,?)";

        Connection conn = connect();

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, x.name);
            pstmt.setString(2, x.username);
            pstmt.setString(3, x.password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // Close connection
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void print(String tableName) {
        String sql = "SELECT * FROM " + tableName;

        Connection conn = connect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("username") + "\t" +
                        rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // Close connection
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// public static void createNewDatabase(String fileName) {

// String url = "jdbc:sqlite:" + fileName;

// try {
// Connection conn = DriverManager.getConnection(url);
// if (conn != null) {
// DatabaseMetaData meta = conn.getMetaData();
// System.out.println("The driver name is " + meta.getDriverName());
// System.out.println("A new database has been created.");
// }

// } catch (SQLException e) {
// System.out.println(e.getMessage());
// }
// }

// public static void createNewTable(String tableName) {
// // SQL statement for creating a new table
// String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (\n"
// + " id integer PRIMARY KEY,\n"
// + " name text NOT NULL,\n"
// + " capacity real\n"
// + ");";

// Connection conn = connect();
// try {
// Statement stmt = conn.createStatement();
// stmt.execute(sql);
// } catch (SQLException e) {
// System.out.println(e.getMessage());
// }

// // Close connection
// try {
// if (conn != null) {
// conn.close();
// }
// } catch (SQLException ex) {
// System.out.println(ex.getMessage());
// }
// }