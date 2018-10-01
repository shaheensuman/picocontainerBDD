package com.wholefoods.framework.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection  {
    private static DatabaseConnection instance;
    private Connection connection;
    Properties prop=new Properties();

    private DatabaseConnection() throws SQLException, IOException {
        prop.load(new FileInputStream("configs//databaseProperty.properties"));
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(prop.getProperty("databaseUrl"), prop.getProperty("databaseUserName"), prop.getProperty("databasePassword"));
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException, IOException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
}
