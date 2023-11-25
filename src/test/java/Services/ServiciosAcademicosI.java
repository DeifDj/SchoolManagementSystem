package Services;

import org.adaschool.schoolmanagement.Course;
import org.adaschool.schoolmanagement.Student;

public interface ServiciosAcademicosI<S> {

    void enrollStudent(Student student);

    void addCourse(Course course);

    void enrollStudentCourse(Student student, int idClass) throws StudentAlreadyEnrolledException;

    void unsubscribeStudentCourse(int idStudent, int idClass) throws StudentNotEnrolledInCourseException;

    void enrollStudentCourse(Student student, Course course);

    void unsubscribeStudentCourse(Student student, Course course);
}
