
package com.mycompany.studentrecordmanagementsystem;

import java.sql.*;
import java.util.*;

public class StudentDAO {

    public List<Student> find(String keyword)
            throws SQLException {

        String sql = "SELECT * FROM students " +
            "WHERE student_number LIKE ? " +
            "OR first_name LIKE ? " +
            "OR last_name LIKE ? " +
            "OR course LIKE ? ORDER BY id DESC";

        List<Student> results = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps =
                 conn.prepareStatement(sql)) {

            String search = "%" + keyword + "%";

            for (int i = 1; i <= 4; i++) {
                ps.setString(i, search);
            }

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    results.add(new Student(
                        rs.getInt("id"),
                        rs.getString("student_number"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("gender"),
                        rs.getString("course"),
                        rs.getInt("year_level"),
                        rs.getString("email"),
                        rs.getString("contact_number")
                    ));
                }
            }
        }

        return results;
    }

    public int add(Student s) throws SQLException {

        String sql =
            "INSERT INTO students " +
            "(student_number, first_name, last_name, " +
            "gender, course, year_level, email, contact_number) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps =
                 conn.prepareStatement(sql)) {

            bind(ps, s);
            return ps.executeUpdate();
        }
    }

    public int update(Student s) throws SQLException {

        String sql =
            "UPDATE students SET student_number=?, " +
            "first_name=?, last_name=?, gender=?, " +
            "course=?, year_level=?, email=?, " +
            "contact_number=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps =
                 conn.prepareStatement(sql)) {

            bind(ps, s);
            ps.setInt(9, s.id);

            return ps.executeUpdate();
        }
    }

    public int delete(int id) throws SQLException {

        String sql =
            "DELETE FROM students WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps =
                 conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate();
        }
    }

    private void bind(PreparedStatement ps, Student s)
            throws SQLException {

        ps.setString(1, s.studentNumber);
        ps.setString(2, s.firstName);
        ps.setString(3, s.lastName);
        ps.setString(4, s.gender);
        ps.setString(5, s.course);
        ps.setInt(6, s.yearLevel);
        ps.setString(7, s.email);
        ps.setString(8, s.contactNumber);
    }
}
