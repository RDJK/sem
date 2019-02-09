package com.napier.sem;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class App {

    public static void main(String[] args)
    {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Driver d;
        }
        catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver.");
            System.exit(-1);
        }

        //Connection to the database
        Connection con = null;
        int retries = 100;

        for(int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to Database...");
            try
            {
                //Wait a bit for db to start
                Thread.sleep(30000);

                //Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/employees?useSSL=false", "root", "example");
                System.out.println("Successfully connected");

                //Wait a bit
                Thread.sleep(10000);

                //Exit loop
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread Interrupted? Should not happen...");
            }
        }

        if (con != null)
        {
            try
            {
                //close the connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }

        System.out.println("Boo yah!");
    }

}
