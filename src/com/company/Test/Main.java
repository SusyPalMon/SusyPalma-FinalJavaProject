package com.company.Test;

import com.company.Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialize minimum 2 different professor Part time
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new FullTimeTeacher("Jorge Torres", 3000, 5));
        teacherList.add(new FullTimeTeacher("Ariana Grande", 2700, 4));
        teacherList.add(new PartTimeTeacher("Cesar Grande", 500, 5));
        teacherList.add(new PartTimeTeacher("Oscar Mendoza", 500, 5));

        // Initialize minimum 6 different students
        List<Student> studentListTotal = new ArrayList<>();
        studentListTotal.add(new Student("LadyRuiz", 23));
        studentListTotal.add(new Student("Alondra Rivas", 20));
        studentListTotal.add(new Student("Mayra Diaz", 20));
        studentListTotal.add(new Student("Oscar Sopla", 30));
        studentListTotal.add(new Student("Christian Montalvo", 19));
        studentListTotal.add(new Student("Kendra Gallegos", 38));
        studentListTotal.add(new Student("Juan Rivas", 34));
        studentListTotal.add(new Student("Katherine Gonzales", 19));

        List<Student> studentListMath = new ArrayList<>();
        studentListMath.add(new Student(studentListTotal.get(0).getNameStudent(), studentListTotal.get(0).getAgeStudent()));
        studentListMath.add(new Student(studentListTotal.get(1).getNameStudent(), studentListTotal.get(1).getAgeStudent()));
        studentListMath.add(new Student(studentListTotal.get(2).getNameStudent(), studentListTotal.get(2).getAgeStudent()));
        studentListMath.add(new Student(studentListTotal.get(3).getNameStudent(), studentListTotal.get(3).getAgeStudent()));
        studentListMath.add(new Student(studentListTotal.get(4).getNameStudent(), studentListTotal.get(4).getAgeStudent()));
        studentListMath.add(new Student(studentListTotal.get(5).getNameStudent(), studentListTotal.get(5).getAgeStudent()));

        List<Student> studentListNetworking = new ArrayList<>();
        studentListNetworking.add(new Student(studentListTotal.get(4).getNameStudent(), studentListTotal.get(4).getAgeStudent()));
        studentListNetworking.add(new Student(studentListTotal.get(6).getNameStudent(), studentListTotal.get(6).getAgeStudent()));
        studentListNetworking.add(new Student(studentListTotal.get(7).getNameStudent(), studentListTotal.get(7).getAgeStudent()));
        studentListNetworking.add(new Student(studentListTotal.get(2).getNameStudent(), studentListTotal.get(2).getAgeStudent()));

        List<Student> studentListBiology = new ArrayList<>();
        studentListBiology.add(new Student(studentListTotal.get(1).getNameStudent(), studentListTotal.get(1).getAgeStudent()));
        studentListBiology.add(new Student(studentListTotal.get(6).getNameStudent(), studentListTotal.get(6).getAgeStudent()));
        studentListBiology.add(new Student(studentListTotal.get(4).getNameStudent(), studentListTotal.get(4).getAgeStudent()));

        List<Student> studentListGeometry = new ArrayList<>();
        studentListGeometry.add(new Student(studentListTotal.get(0).getNameStudent(), studentListTotal.get(0).getAgeStudent()));
        studentListGeometry.add(new Student(studentListTotal.get(3).getNameStudent(), studentListTotal.get(3).getAgeStudent()));
        studentListGeometry.add(new Student(studentListTotal.get(5).getNameStudent(), studentListTotal.get(5).getAgeStudent()));

        // Initialize minimum 4 different classes
        List<UniversityClass> classList = new ArrayList<>();
        classList.add(new UniversityClass("Mathematics", 101, studentListMath, teacherList.get(0)));
        classList.add(new UniversityClass("Networking", 402, studentListNetworking, teacherList.get(1)));
        classList.add(new UniversityClass("Biology", 201, studentListBiology, teacherList.get(2)));
        classList.add(new UniversityClass("Geometry", 302, studentListGeometry, teacherList.get(3)));

        // Initialize a University
        University university = new University(teacherList, studentListTotal, classList);

        System.out.println("******** WELCOME ********");
        boolean continueMenu = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What do you want to do?");
            System.out.println(" 1. Print all the professors \n 2. Print class details selected by class name \n 3. Create a new student " +
                    "\n 4. Create a new class \n 5. List all the classes in which a given student is included \n 6. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Print all the professors
                    System.out.println("Teacher List");
                    System.out.println("************************");

                    for (int i = 0; i < university.getUniversityTeacherList().size(); i++) {
                        System.out.println(university.getUniversityTeacherList().get(i).toString());
                    }

                    break;
                case 2:
                    // Print class detail selected by class name
                    System.out.println("There are the following classes");
                    for (int i = 0; i < university.getUniversityClassList().size(); i++) {
                        System.out.println(university.getUniversityClassList().get(i).getName());
                    }

                    System.out.println("");
                    // Ask to select one class by name
                    System.out.println("Enter class by name");
                    String nameClass = scanner.next();

                    for (int i = 0; i < university.getUniversityClassList().size(); i++) {
                        boolean containClassName = university.getUniversityClassList().get(i).getName().contains(nameClass);
                        if (containClassName == true) {
                            university.getUniversityClassList().get(i).printClassDetails();
                        }
                    }

                    break;
                case 3:
                    // Create a new student
                    System.out.println("Enter student name");
                    String studentName = scanner.next();
                    System.out.println("Enter student age");
                    int age = scanner.nextInt();
                    // Add new student to studentListTotal
                    studentListTotal.add(new Student(studentName, age));
                    System.out.println("Student has been added successfully");
                    int studentListSize = studentListTotal.size();
                    System.out.println("Now there are " + studentListSize + " students");
                    System.out.println("");
                    System.out.println("*******Student List updated*******");
                    // Set studentId of the new student added
                    studentListTotal.get(studentListSize - 1).setIdStudent(studentListSize);

                    System.out.println("There are at university, the following students");
                    System.out.println("");
                    for (int i = 0; i < university.getUniversityStudentsList().size(); i++) {
                        System.out.println(university.getUniversityStudentsList().get(i).toString());
                    }
                    System.out.println("");
                    System.out.println("Select the class where student will be added. There are available the following classes to choose");
                    System.out.println("");
                    for (int i = 0; i < university.getUniversityClassList().size(); i++) {
                        System.out.println(university.getUniversityClassList().get(i).getName());
                    }

                    System.out.println("");
                    System.out.println("Enter class name");
                    String classNameStudent = scanner.next();
                    for (int i = 0; i < university.getUniversityClassList().size(); i++) {
                        boolean containClassName = university.getUniversityClassList().get(i).getName().contains(classNameStudent);
                        if (containClassName) {
                            university.getUniversityClassList().get(i).getStudentListClass().add(new Student(studentName, age));
                            System.out.println(studentName + " has been added successfully to class: " + classNameStudent);
                        }
                    }
                    break;
                case 4:
                    // Create a new class
                    System.out.println("Enter class name");
                    String className = scanner.next();
                    System.out.println("Enter assigned classroom number");
                    int assignedClassroom = scanner.nextInt();

                    List<Student> studentList = new ArrayList<>();
                    boolean continueAddingStudents = false;
                    Scanner scanner1 = new Scanner(System.in);
                    do {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("There are these students at university");
                        for (int i = 0; i < university.getUniversityStudentsList().size(); i++) {
                            System.out.println(university.getUniversityStudentsList().get(i).getNameStudent());
                        }
                        System.out.println("");
                        System.out.println("Enter student name to the class");
                        String studentNameClass = scanner2.next();
                        // Validate if student exists
                        for (int i = 0; i < studentListTotal.size(); i++) {
                            boolean containStudent = studentListTotal.get(i).getNameStudent().contains(studentNameClass);
                            if (containStudent == true) {
                                studentList.add(new Student(studentListTotal.get(i).getNameStudent(),
                                        studentListTotal.get(i).getAgeStudent()));
                            }
                        }
                        System.out.println("Will you continue adding students to class? Enter true or false");
                        continueAddingStudents = scanner1.nextBoolean();
                    } while (continueAddingStudents);

                    System.out.println("This is the list of students that will be added to new claas");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i).toString());
                    }
                    System.out.println(" ");
                    System.out.println("Enter teacher to the class. You can assign only one. Choose among these teachers");
                    for (int i = 0; i < university.getUniversityTeacherList().size(); i++) {
                        System.out.println(university.getUniversityTeacherList().get(i).getName());
                    }
                    System.out.println(" ");
                    String teacherName = scanner1.next();
                    // Validate if teacher exists
                    for (int i = 0; i < teacherList.size(); i++) {
                        boolean containTeacher = teacherList.get(i).getName().contains(teacherName);
                        if (containTeacher) {
                            classList.add(new UniversityClass(className, assignedClassroom, studentList, teacherList.get(i)));
                        }
                    }

                    System.out.println("Updated classes at University");
                    System.out.println("");

                    for (int i = 0; i < university.getUniversityClassList().size(); i++) {
                        university.getUniversityClassList().get(i).printClassDetails();
                        System.out.println("");
                    }
                    break;
                case 5:
                    // List all the classes in which a given student is included
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Enter student name");
                    String classStudentName = scanner5.next();
                    System.out.println(classStudentName + " is registered in the following classes");
                    System.out.println("");
                    for (int i = 0; i < university.getUniversityClassList().size(); i++) {
                        for (int j = 0; j < university.getUniversityClassList().get(i).getStudentListClass().size(); j++) {
                            boolean containStudentClass = university.getUniversityClassList().get(i).getStudentListClass().get(j).getNameStudent().contains(classStudentName);
                            if (containStudentClass == true) {
                                System.out.println("Class name: " + university.getUniversityClassList().get(i).getName());
                                System.out.println("Assigned classroom: " + university.getUniversityClassList().get(i).getAssignedClassroom());
                                System.out.println("Teacher name: " + university.getUniversityClassList().get(i).getTeacherListClass().getName());
                                System.out.println("");
                            }
                        }
                    }

                    break;
                case 6:
                    // Exit
                    System.out.println("Thank you for coming");
                    break;
                default:{
                    System.out.println("Invalid option");
                }
            }
            System.out.println(" ");
            System.out.println("Do you want to continue here? Enter true or false");
            continueMenu = scanner.nextBoolean();
        } while(continueMenu);

        }

    }


