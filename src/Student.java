public class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student st= new Student(123,"dan");
        System.out.println(st);

    }
}
