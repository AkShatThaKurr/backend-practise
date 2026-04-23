package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_03_DeleteData {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "9215";

        String query = "Delete from students where id = ?";

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1,16);
            int rows1 = pr.executeUpdate();
            pr.setInt(1,17);
            int rows2 = pr.executeUpdate();
            System.out.println("Rows deleted: " + (rows1 + rows2));

            pr.close();
            con.close();
        }

        catch(Exception e){
            e.printStackTrace();
        }

    }
}
