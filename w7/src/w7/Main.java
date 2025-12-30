package w7;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aayush", 20));
        students.add(new Student("Sita", 19));

        System.out.println("Student Records:");
        for (Student s : students) {
            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
            
        }
    }
    
}
