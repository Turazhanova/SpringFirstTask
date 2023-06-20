package BitLab.TechOrda.SprintBoot.SprintTask1.SprintTask1.db;

import BitLab.TechOrda.SprintBoot.SprintTask1.SprintTask1.Controller.Student;

import java.util.ArrayList;

public class DBManager {
    private static Long id = 1L;
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(Student student){
        student.setId(id++);
        if (student.getPoint() >= 90){
            student.setMark("A");
        } else if (student.getPoint() >= 75){
            student.setMark("B");
        } else if (student.getPoint() >= 60){
            student.setMark("C");
        } else if (student.getPoint() >= 50){
            student.setMark("D");
        } else {
            student.setMark("F");
        }
        students.add(student);

    }

    public static ArrayList<Student> getStudents(){
        return students;
    }
}
