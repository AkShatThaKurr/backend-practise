package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_04_CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "9215";

        String query = "create table employee( id int primary key auto_increment, name varchar(25) not null, age int not null, salary double not null)";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            System.out.println("Table created Successfully");
            stmt.close();
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

