package org.adaschool.schoolmanagement;

import ch.qos.logback.classic.spi.STEUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico {
    private List<Student> students;
    private List<Class> classes;

    private Map<Class, List<Student>> studentsByCourse;

    public GestorAcademico() {
        students = new ArrayList<>();
        classes = new ArrayList<>();
        studentsByCourse = new HashMap<>();
    }

    // Métodos para agregar estudiantes y cursos
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addClass(Class class) {
        classes.add(class);
        studentsByCourse.put((Class) classes, new ArrayList<>());
    }

    // Método para inscribir estudiantes en un curso
    public void enrollStudentInCourse(Student student, Class class) {
        if (classes.contains(classes) && students.contains(student)) {
            List<Student> studentsEnrolled = studentsByCourse.get(classes);
            studentsEnrolled.add(student);
            studentsByCourse.put((Class) classes, studentsEnrolled);
        } else {
            System.out.println("Estudiante o curso no encontrado");
        }
    }

}
