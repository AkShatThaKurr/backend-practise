package JDBC;
import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;

    public class JDBC_01_FetchData {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/spark";
            String username = "root";
            String password = "9215";

            String query = "select * from students";

            try {
                //Step1:- Load the Driver:
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Step2:- Make the connection:
                Connection con = DriverManager.getConnection(url,username,password);
                //Step3:- Create Statement:
                Statement stmt = con.createStatement();
                //Step4: Execute:
                ResultSet rs = stmt.executeQuery(query);
                //Step5: Get the Result:
                while(rs.next()){
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name")
                            + " | " + rs.getInt("age") + " | " + rs.getString("course"));
                }


            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
