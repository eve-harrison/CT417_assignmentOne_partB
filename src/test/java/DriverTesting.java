import eveHarrison_assignmentOne.*;
import eveHarrison_assignmentOne.Module;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class DriverTesting {

    @Test
    @DisplayName("Input All Student Mock Data")
    public void InputAllMockStudentData() {

        Driver mockDataDriver = new Driver();

        Student s1 = new Student("Eve Harrison",  19464796, DateTime.parse("2000-11-29"));
        Student s2 = new Student("Robyn Meaney",  19498762, DateTime.parse("2000-08-05"));
        Student s3 = new Student("Shane Brenan",  18965421, DateTime.parse("1999-12-16"));
        Student s4 = new Student("Rory O'Neil",  19424896, DateTime.parse("2001-07-10"));
        mockDataDriver.addStudent(s1);
        mockDataDriver.addStudent(s2);
        mockDataDriver.addStudent(s3);
        mockDataDriver.addStudent(s4);

        s1.setAge(21);
        s2.setAge(22);
        s3.setAge(23);
        s4.setAge(20);

        Lecturer l1 = new Lecturer("Britney Spears",  2048,  DateTime.parse("1989-05-29"));
        Lecturer l2 = new Lecturer("Phoebe Bridgers",  101,  DateTime.parse("1993-10-10"));
        Lecturer l3 = new Lecturer("Michael Scott",  2056,  DateTime.parse("1970-02-10"));
        Lecturer l4 = new Lecturer("Kendrick Lamar",  3896,  DateTime.parse("1987-01-04"));

        l1.setAge(45);
        l2.setAge(27);
        l3.setAge(58);
        l4.setAge(35);

        mockDataDriver.addLecturer(l1);
        mockDataDriver.addLecturer(l2);
        mockDataDriver.addLecturer(l3);
        mockDataDriver.addLecturer(l4);

        Module m1 = new Module("Software Engineering", l1);
        Module m2 = new Module("Organic Chemistry", l2);
        Module m3 = new Module("Paleontology", l3);
        Module m4 = new Module("Ireland In The Global Economy", l2);

        mockDataDriver.addNewModule(m1);
        mockDataDriver.addNewModule(m2);
        mockDataDriver.addNewModule(m3);
        mockDataDriver.addNewModule(m4);

        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        m1.addStudent(s4);

        m2.addStudent(s1);
        m2.addStudent(s3);

        m3.addStudent(s1);
        m3.addStudent(s2);
        m3.addStudent(s4);

        Course c1 = new Course("Electronic and Computer Engineering",  DateTime.parse("2019-09-04"), DateTime.parse("2023-05-04"));
        Course c2 = new Course("MicroBiology",  DateTime.parse("2019-09-04"), DateTime.parse("2024-05-04"));
        Course c3 = new Course("Zoology",  DateTime.parse("2018-09-04"), DateTime.parse("2022-05-04"));
        Course c4 = new Course("Commerce",  DateTime.parse("2019-09-04"), DateTime.parse("2022-05-04"));

        s1.setCourse(c1);
        s2.setCourse(c2);
        s3.setCourse(c3);
        s4.setCourse(c4);

        c1.addModules(m1);
        c2.addModules(m2);
        c3.addModules(m3);
        c4.addModules(m4);

        mockDataDriver.addCourse(c1);
        mockDataDriver.addCourse(c2);
        mockDataDriver.addCourse(c3);
        mockDataDriver.addCourse(c4);

        mockDataDriver.printCoursesAndModules();
        mockDataDriver.printStudentsAndModules();
        mockDataDriver.printLecturers();
    }
}
