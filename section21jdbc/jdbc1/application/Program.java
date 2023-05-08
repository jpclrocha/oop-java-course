package section21jdbc.jdbc1.application;

import section21jdbc.jdbc1.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection con = DB.getConnection();


        DB.closeConnection();
    }
}
