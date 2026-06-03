package org.example.Dao;

import org.example.Entity.Student;

import java.sql.*;

public class Dbutil {

    private static String url = "jdbc:mysql://localhost:3306/students";
    private static String user = "root";
    private static String password = "Rashmi123@";

    private static Connection connection = null;

    public static void connectToDb() {

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int insert(Student student) {

        String sql = "insert into studentdata values(?,?,?)";

        try {

            PreparedStatement prt =
                    connection.prepareStatement(sql);

            prt.setInt(1, student.getId());
            prt.setString(2, student.getName());
            prt.setString(3, student.getCourse());

            return prt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteByid(int id) {

        String sql = "delete from studentdata where id=?";

        try {

            PreparedStatement prt =
                    connection.prepareStatement(sql);

            prt.setInt(1, id);

            return prt.executeUpdate() > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int update(Student student) {

        String sql =
                "update studentdata set name=?,course=? where id=?";

        try {

            PreparedStatement prt =
                    connection.prepareStatement(sql);

            prt.setString(1, student.getName());
            prt.setString(2, student.getCourse());
            prt.setInt(3, student.getId());

            return prt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DisplayAll() {

        String sql = "select * from studentdata";

        try {

            Statement stm =
                    connection.createStatement();

            ResultSet rs =
                    stm.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " | "
                                + rs.getString(2) + " | "
                                + rs.getString(3)
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getByid(int id) {

        String sql =
                "select * from studentdata where id=?";

        try {

            PreparedStatement prt =
                    connection.prepareStatement(sql);

            prt.setInt(1, id);

            ResultSet rs = prt.executeQuery();

            if (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " | "
                                + rs.getString(2) + " | "
                                + rs.getString(3)
                );
            } else {
                System.out.println("Data Not Found");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}