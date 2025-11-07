import java.util.List;

// Service layer: connects DAO and main app logic
public class StudentService {
    private StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    public void viewStudents() {
        List<Student> list = dao.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("\nRollNo | Name | Age | Address");
            System.out.println("--------------------------------");
            list.forEach(System.out::println);
        }
    }

    public void updateStudent(int rollNo, String name, int age, String address) {
        dao.updateStudent(rollNo, name, age, address);
    }

    public void deleteStudent(int rollNo) {
        dao.deleteStudent(rollNo);
    }
}
