
import java.util.*;

class Student implements Comparable <Student> {
    int age;
    String name;

    public Student(int a, String n) {
        age = a;
        name = n;
    }

    public int compareTo(Student s) {
        return this.age-s.age;
    }
}

public class compare_obj {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(12,"Chintu"));
        list.add(new Student(14,"Rupesh"));
        
        
    }    
}
