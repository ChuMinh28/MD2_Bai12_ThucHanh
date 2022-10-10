package thuchanh3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien",30,"BN");
        Student student1 = new Student("Nam",21,"HN");
        Student student2 = new Student("Minh",23,"BN");
        Student student3 = new Student("Mai",22,"BN");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for (Student st:list
             ) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("so sanh theo tuoi");
        for (Student st:list
             ) {
            System.out.println(st.toString());
        }
    }
}
