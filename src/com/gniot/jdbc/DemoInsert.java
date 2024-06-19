package com.gniot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoInsert {

    public static void main(String args[]) {
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crs_schema", "root", "123");

          
            insertEmployee(con, 103, "Ratamhh");

        
            updateEmployee(con, 101, "Ratan");

          
            deleteEmployee(con, 103);

          
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertEmployee(Connection con, int id, String name) {
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO emp (id, name) VALUES (?, ?)");
            stmt.setInt(1, id);
            stmt.setString(2, name);

            int i = stmt.executeUpdate();
            System.out.println(i + " record(s) inserted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateEmployee(Connection con, int id, String name) {
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE emp SET name = ? WHERE id = ?");
            stmt.setString(1, name);
            stmt.setInt(2, id);

            int i = stmt.executeUpdate();
            System.out.println(i + " record(s) updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteEmployee(Connection con, int id) {
        try {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM emp WHERE id = ?");
            stmt.setInt(1, id);

            int i = stmt.executeUpdate();
            System.out.println(i + " record(s) deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}