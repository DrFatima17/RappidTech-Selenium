import java.sql.*;

public class DataBases {
    public static void main(String[] args) throws SQLException{
        // Tester will only test anything that he/she inserts or deletes from database.
        // selenium is not a tool to test database. it only tests web applications
        // selenium only automate browsers/webs elements.
        // driver is downloaded so that you can communicate with java

        // query: extract all employees from the database table employees2 WITHOUT using UI
        String query = "select * from employees2";

        //We Need: url,username,password
        // String url has connection: jdbc, type of database: postgresql and then the url as shown below:
        String url = "jdbc:postgresql://rappidtechdb.c9gw58tlkxgg.us-east-1.rds.amazonaws.com/";
        String username = "postgres";
        String password = "postgres";

        // Step 1: Establish a connection between Java and URL that you will work on:
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("We are now connected to the PostgreSQL server successfully");

        // Step 2: Create a statement from that connection:    (statement is a class)
        Statement statement = connection.createStatement();

        // Step 3: Execute the query using that statement in class ResultSet
        ResultSet resultSet = statement.executeQuery(query);

        // Step 4: Retrieve data from the resultSet by column names
        while (resultSet.next()) {
            String employeeId = resultSet.getString("employee_id");
            String employeeFirstName = resultSet.getString("first_name");
            String employeeLastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            System.out.println("The employee Id is : {" + employeeId + "} and their Full name is " +
                    employeeFirstName + ", " + employeeLastName + " and their email is {" + email + "}");
        }
        //Step 5: Close the connection:
        connection.close();
    }
}
