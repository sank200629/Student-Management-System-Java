package projectjava;

public class Student {

    private int id;
    private String name;
    private int age;
    private String department;
    private double marks;

    public Student(int id, String name, int age, String department, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + department + " | " + marks;
    }
}

