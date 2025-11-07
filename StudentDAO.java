import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object (handles database operations)
public class StudentDAO {

    public void addStudent(Student student) {
        String sql = "INSERT INTO students (name, age, address) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getAddress());
            ps.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection con = DBConnection.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("rollNo"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("address")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateStudent(int rollNo, String name, int age, String address) {
        String sql = "UPDATE students SET name=?, age=?, address=? WHERE rollNo=?";
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);
            ps.setInt(4, rollNo);
            int updated = ps.executeUpdate();
            if (updated > 0)
                System.out.println("Student updated successfully!");
            else
                System.out.println("No student found with that Roll No.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int rollNo) {
        String sql = "DELETE FROM students WHERE rollNo=?";
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, rollNo);
            int deleted = ps.executeUpdate();
            if (deleted > 0)
                System.out.println("Student deleted successfully!");
            else
                System.out.println("No student found with that Roll No.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
