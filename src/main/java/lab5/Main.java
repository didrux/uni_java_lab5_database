package lab5;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        DatabaseService db = new DatabaseService("jdbc:postgresql://localhost:5432/javadb", "postgres", "didruxpass");
        db.connect();
        db.createTables();

    }
}