package other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {

    private final String URL = "jdbc:mysql://localhost:3306/users_stats?useSSL=false";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    private Connection connection;

//    public boolean isConnected() {
//        try {
//            if (connection.isClosed() == false) {
//                return true;
//            } else if (connection.isClosed() == true || connection == null) {
//            return false;
//            }
//            else{
//                return false;
//            }
//        } catch (SQLException | NullPointerException e) {
//            System.out.println("Ahibackal");
//            return false;
//        }
//    }

    public void connect() throws  ClassNotFoundException, SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void disconnect() throws SQLException {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Ne otkluchilos");
            }
    }

    public Connection getConnection() {
        return connection;
    }


    public void createTable() throws SQLException {
        try {
            String createTable = "CREATE TABLE IF NOT EXISTS player_stats(uuid varchar(36) primary key, player_name varchar(36), kills int, deaths int, balance int)";
            Statement statement = connection.createStatement();
            statement.execute(createTable);
            statement.close();
            System.out.println("Table is created");
        } catch (SQLException e){
            System.out.println("Table not created");
            e.printStackTrace();
        }
    }

    public boolean isPlayerInDb(String uuid) throws SQLException{
        Statement statement = getConnection().createStatement();
        String sql = "SELECT * FROM player_stats WHERE uuid = " + uuid;
        return statement.execute(sql);
    }

    public void insertStatsPlayer(String uuid, String name, int kills, int deaths, int balance){



    }

}
