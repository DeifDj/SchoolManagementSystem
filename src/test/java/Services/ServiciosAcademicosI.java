package Services;

import org.adaschool.schoolmanagement.Course;
import org.adaschool.schoolmanagement.Student;

public interface ServiciosAcademicosI {

    void enrollStudent(Student student);
    void addClass(Course classes);

    void addClass(java.lang.Class classes);

    void addCourse(java.lang.Course course);

    void addCourse(Course course);

    void enrollStudentCourse(Student student, int idClass) throws StudentAlreadyEnrolledException;

    void unsubscribeStudentCourse(int idStudent, int idClass) throws StudentNotEnrolledInCourseException;

    void enrollStudentCourse(Student student, Course course);

    void unsubscribeStudentCourse(Student student, Course course);
}
