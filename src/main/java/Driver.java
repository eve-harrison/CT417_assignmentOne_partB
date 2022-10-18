import eveHarrison_assignmentOne.*;
import eveHarrison_assignmentOne.Module;

import java.util.ArrayList;

public class Driver {

    private ArrayList<Student> studentsArray;
    private ArrayList<Lecturer> lecturersArray;
    private ArrayList<Course> coursesArray;
    private ArrayList<Module> modulesArray;

    public Driver() {
        coursesArray = new ArrayList<>();
        modulesArray = new ArrayList<>();
        studentsArray = new ArrayList<>();
        lecturersArray = new ArrayList<>();
    }

    public void addNewModule(Module newModule) {
        modulesArray.add(newModule);
    }

    public boolean addStudent(Student newStudent) {
        return studentsArray.add(newStudent);
    }

    public boolean addLecturer(Lecturer newLecturer) {
        return lecturersArray.add(newLecturer);
    }

    public boolean addCourse(Course newCourse) {
        for (Module m : newCourse.getAssociatedModules()) {
            addNewModule(m);
        }
        if (!coursesArray.contains(newCourse)) {
            return coursesArray.add(newCourse);
        } else {
            System.out.println("ERROR! Course has already been added.");
            return false;
        }
    }

    public void printCoursesAndModules() {
        System.out.println("======================================================");
        System.out.println("List of Courses and their Associated Module: ");
        for (Course course : coursesArray) {
            System.out.println("Course : " + course.getCourseName());
            for (Module module : course.getAssociatedModules()) {
                System.out.println("Associated Module : " + module.getModuleName());
            }
        }
        System.out.println("=====================================================");
    }

    public void printStudentsAndModules() {
        System.out.println("List of Students with their Associated Courses and Modules: ");
        for (Student student : studentsArray) {
            System.out.println(student.getName() + "(" + student.getUserName() + "):");
            System.out.println("Course Enrolled In : " + student.getCourse().getCourseName());
            for (Module module : student.getModules()) {
                System.out.println("Associated Module : " + module.getModuleName());
            }
        }
        System.out.println("======================================================");
    }

    public void printLecturers() {
        System.out.println("List of Lecturers : ");
        for (Lecturer lecturer : lecturersArray) {
            System.out.println("Lecturer Username : " + lecturer.getUserName());
        }
    }
}

