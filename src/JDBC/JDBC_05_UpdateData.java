package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_05_UpdateData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "9215";

        String query = "update employee set salary = ? where id = ? ";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pr = con.prepareStatement(query);

            pr.setDouble(1,28000);
            pr.setInt(2,2);
            int rows = pr.executeUpdate();
            System.out.println("Rows updated: " + rows);

            pr.close();
            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
