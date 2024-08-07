
import Student.FulltimeStudent;
import Student.Student;
import Student.StudentFactory;

public class LabExamMain {
    public static void main(String[] args) {
        // Make multiple Students of Each Type using Factory

        // Store Students in a Collection

        // Iterate through Collection and print Students with GPA above 50%
        StudentFactory studentFactory = new StudentFactory();

       
        Student student1 = studentFactory.getIsfullTime(true);
        student1.FulltimeStudent(1,"abc",100);

        Student student2 = studentFactory.getIsfullTime(false);
        Student2.partTimeStudent(34,"bdc",68);

        Student student3 = studentFactory.getIsfullTime(true);
        Student3.FulltimeStudent(12,"josh",45);

        Student student4 = studentFactory.getIsfullTime(true);
        Student4.FulltimeStudent(1,"ty12",45);

        Student student5 = studentFactory.getIsfullTime(false);
        Student5.partTimeStudent(34,"ty123",70);

        Student student6 = studentFactory.getIsfullTime(true);
        Student6.FulltimeStudent(12,"ty1234",30);
     


    
    }
}
