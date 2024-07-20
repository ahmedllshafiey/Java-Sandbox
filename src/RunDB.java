// Example 7: Running a database query

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RunDB {

    public static void main(String[] args) {
        try (Connection connection = DB.connect(); PreparedStatement statement = connection.prepareStatement("SELECT * FROM items"); ResultSet resultSet = statement.executeQuery()) {

            System.out.println("Connected to the database.");

            while (resultSet.next()) {
                // Assuming you have columns "id" and "name" in your "items" table
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
