package org.adaschool.schoolmanagement;

import Services.ServiciosAcademicosI;
import org.adaschool.schoolmanagement.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GestorAcademico implements ServiciosAcademicosI {
    private List<Student> students;
    private List<Student> courses;
    private Map<Course, List<Student>> studentsByCourse;

    public GestorAcademico() {
        students = new ArrayList<>();
        courses = new ArrayList<Student>();
        studentsByCourse = new HashMap<>();
    }

    // Métodos para agregar estudiantes y cursos

    @Override
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Estudiante matriculado exitosamente.");
        } else {
            System.out.println("El estudiante ya está matriculado.");
        }
    }

    public void addCourse(Student course) {
        if (!courses.contains(course)) {
            courses.add(course);
           // List<Student> put = studentsByCourse.put(course, new ArrayList<>());
            System.out.println("Curso agregado correctamente.");
        } else {
            System.out.println("El curso ya existe.");
        }
    }

    @Override
    public void enrollStudentCourse(Student student, Course course) {
        if (courses.contains(course) && students.contains(student)) {
            List<Student> studentsEnrolled = studentsByCourse.get(course);
            if (!studentsEnrolled.contains(student)) {
                studentsEnrolled.add(student);
                studentsByCourse.put(course, studentsEnrolled);
                System.out.println("Estudiante inscrito en el curso correctamente.");
            } else {
                System.out.println("El estudiante ya está inscrito en este curso.");
            }
        } else {
            System.out.println("Estudiante o curso no encontrado.");
        }
    }

    @Override
    public void unsubscribeStudentCourse(Student student, Course course) {
        if (courses.contains(course) && students.contains(student)) {
            List<Student> studentsEnrolled = studentsByCourse.get(course);
            if (studentsEnrolled.contains(student)) {
                studentsEnrolled.remove(student);
                studentsByCourse.put(course, studentsEnrolled);
                System.out.println("Estudiante desinscrito del curso correctamente.");
            } else {
                System.out.println("El estudiante no está inscrito en este curso.");
            }
        } else {
            System.out.println("Estudiante o curso no encontrado.");
        }
    }

    public abstract void addClass(Course classes);

    public abstract void addClass(Class classes);
}
