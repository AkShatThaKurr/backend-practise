package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_01_InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Spark";
        String username = "root";
        String password = "9215";

        String query = "insert into students(name,age,course) values(?,?,?)";

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pr = con.prepareStatement(query);
            // 1st Entry:
            pr.setString(1,"Dev Bhatnagar");
            pr.setInt(2,27);
            pr.setString(3,"LLB");
            pr.executeUpdate();

            // 2nd Entry:
            pr.setString(1,"Mohit Bansal");
            pr.setInt(2,29);
            pr.setString(3,"MBBS");
            pr.executeUpdate();

            System.out.println("Data Inserted Successfully.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
