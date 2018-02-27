package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompts user to enter student's name and year    
    public Student() {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter student FIRST name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student LAST name: ");
        this.lastName = in.nextLine();

        System.out.println("Who YOU are?\n"
                + "1 - Freshmen\n"
                + "2 - Softmore\n"
                + "3 - Junior\n"
                + "4 - Senior\n"
                + "Enter student GRADE YEAR: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

    // Generate an ID
    private void setStudentID() {
        // Grade level + Static ID
        id++;
        this.studentID = gradeYear + " " + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop hits 0
        do {
            System.out.print("Enter a course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q") == !course.equals("q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

    }

    //View balance and pay Tuition
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank You for your payment of $ " + payment);
        viewBalance();
    }

    // Show status
    public String showInfo() {
        return "name: " + firstName + " " + lastName +
                "\nGrade level " + gradeYear +
                "\nStudent ID: " + studentID
                + "\nCourses Enrolled: " + courses
                + "\nBalance: $" + tuitionBalance;
    }
}
