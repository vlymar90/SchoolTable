package sample.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
    private static Connection connection;
    private static Dao instance;

    private Dao(){}

    public static Dao getInstance() {
        if (instance == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/school", "root"
                        , "753357951Ga");
                instance = new Dao();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

        }
        return instance;
    }

    public void add(int id_user, int avg_user, int total) {
        try {
            PreparedStatement statement = connection.prepareStatement("Insert into data_user value (1, ?, ?, ?);");
            statement.setInt(1, id_user);
            statement.setInt(2, avg_user);
            statement.setInt(3, total);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
