package com.wholefoods.framework.database;

import java.sql.Connection;
import java.util.Properties;

public class DatabaseConnection  {
    private DatabaseConnection instance;
    private Connection connection;

    public DatabaseConnection() {
        Properties properties;
        try {
            Class.forName(" ");
          //  this.connection= DriverManager.getConnection()
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
