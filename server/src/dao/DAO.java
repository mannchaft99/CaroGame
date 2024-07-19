/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 42un19ue
 */
public class DAO {

    /**
     * @param args the command line arguments
     */
    protected Connection con;

    public DAO() {
        final String DATABASE_NAME = "test"; // TODO FILL YOUR DATABASE NAME
        final String URL = "jdbc:mysql://127.0.0.1:3306/caro";
        final String USER = "root";  // TODO FILL YOUR DATABASE USER
        final String PASSWORD = "123456"; // TODO FILL YOUR DATABASE PASSWORD
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }
}
