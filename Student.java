// Model class (represents one student record)
public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String address;

    // Constructor for fetching existing students (with rollNo)
    public Student(int rollNo, String name, int age, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Constructor for adding new students (auto rollNo)
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return rollNo + " | " + name + " | " + age + " | " + address;
    }
}
