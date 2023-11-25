package Services;

import org.adaschool.schoolmanagement.Course;
import org.adaschool.schoolmanagement.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ServiciosAcademicos implements ServiciosAcademicosI {
    private List<Student> studentList;
    private List<Course> courseList;
    private Map<Integer, List<Integer>> studentsByCourse;

    public ServiciosAcademicos() {
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();
        studentsByCourse = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
            System.out.println("Estudiante matriculado exitosamente.");
        } else {
            System.out.println("El estudiante ya está matriculado.");
        }
    }

    @Override
    public void addCourse(Course course) {
        if (!courseList.contains(course)) {
            courseList.add(course);
            List<Integer> put; studentsByCourse.get(course);
            System.out.println("Curso agregado correctamente.");
        } else {
            System.out.println("El curso ya existe.");
        }
    }

    @Override
    public void enrollStudentCourse(Student student, int idCourse) throws StudentAlreadyEnrolledException {
        if (studentsByCourse.containsKey(idCourse) && studentList.contains(student)) {
            List<Integer> studentsEnrolled = studentsByCourse.get(idCourse);
            if (studentsEnrolled.contains(student.getId())) {
                throw new StudentAlreadyEnrolledException("El estudiante ya está inscrito en este curso.");
            } else {
                studentsEnrolled.add(student.getId());
                studentsByCourse.put(idCourse, studentsEnrolled);
                System.out.println("Estudiante inscrito en el curso correctamente.");
            }
        } else {
            throw new StudentAlreadyEnrolledException("El curso no existe o el estudiante no está registrado.");
        }
    }

    @Override
    public void unsubscribeStudentCourse(int idStudent, int idClass) throws StudentNotEnrolledInCourseException {
        if (studentsByCourse.containsKey(idClass)) {
            List<Integer> studentsEnrolled = studentsByCourse.get(idClass);
            if (studentsEnrolled.contains(idStudent)) {
                studentsEnrolled.remove(Integer.valueOf(idStudent));
                studentsEnrolled.get(idClass);
                System.out.println("Estudiante desinscrito del curso correctamente.");
            } else {
                throw new StudentNotEnrolledInCourseException("El estudiante no está inscrito en este curso.");
            }
        } else {
            throw new StudentNotEnrolledInCourseException("El curso no existe.");
        }
    }}
