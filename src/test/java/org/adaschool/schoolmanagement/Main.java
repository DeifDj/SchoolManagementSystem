package org.adaschool.schoolmanagement;

import Services.StudentAlreadyEnrolledException;
import Services.StudentNotEnrolledInCourseException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Student student1 = new Student();
        // Establecer datos para estudiante1
        student1.setName();
        //...

        Student student2 = new Student();
        // Establecer datos para estudiante2
        Student.setName();
        //...

        // Crear dos cursos
        Course course1 = new Course();
        // Establecer datos para curso1
        String curso1 = "Curso1";
        //...

        Course course2 = new Course();
        // Establecer datos para curso2
        String curso2 = "Curso2";
        //...

        // Instanciar GestorAcademico
        GestorAcademico gestorAcademico = new GestorAcademico() {

            /**
             * @param classes
             */
            @Override
            public void addClass(Course classes) {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("enter id");
//                int id= scanner.nextInt();
//                System.out.println("enter name");
//                String name = scanner.next();
//                System.out.println("enter description");
//                String description = scanner.next();
//                System.out.println("enter Numercredits");
//                int numbercredist = scanner.nextInt();
//                System.out.println("enter version");
//                String version = scanner.next();

            }

            /**
             * @param classes
             */
            @Override
            public void addClass(Class classes) {

            }

            /**
             * @param course
             */
            @Override
            public void addCourse(Course course) {

            }

            /**
             * @param student
             * @param idClass
             * @throws StudentAlreadyEnrolledException
             */
            @Override
            public void enrollStudentCourse(Student student, int idClass) throws StudentAlreadyEnrolledException {

            }

            /**
             * @param idStudent
             * @param idClass
             * @throws StudentNotEnrolledInCourseException
             */
            @Override
            public void unsubscribeStudentCourse(int idStudent, int idClass) throws StudentNotEnrolledInCourseException {

            }
        };

        // Probar la inscripción de estudiantes
        gestorAcademico.addCourse(student1);
        gestorAcademico.addCourse(student2);

        // Probar la creación de cursos
        gestorAcademico.addCourse(course1);
        gestorAcademico.addCourse(course2);

        gestorAcademico.enrollStudentCourse(student1, course1);
        gestorAcademico.enrollStudentCourse(student2, course2);

        // Desinscribir estudiantes de cursostry {

    }


}