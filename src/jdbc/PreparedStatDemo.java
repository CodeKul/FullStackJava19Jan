package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatDemo {

    public static void main(String[] args) {
        try {
            int id;
            String name;
            String address;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id=>");
            id = scanner.nextInt();
            System.out.println("Enter Name->");
            name = scanner.next();
            System.out.println("Enter Address");
            address = scanner.next();

            String insert = "Insert into employee(id,name,address) values(?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/java19jan?characterEncoding=latin1", "root", "password");
            PreparedStatement statement = connection.prepareCall(insert);

            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setString(3,address);

            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
