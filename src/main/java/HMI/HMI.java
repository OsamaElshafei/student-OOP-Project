package HMI;

import academy.person;
import academy.school;
import academy.student;
import academy.teacher;
import java.util.Scanner;
import services.schoolservices;

public class HMI {

    private static schoolservices schoolservices;

    public static void start() {
        school school = HMI.createschool();
        System.out.println("welcome to " + school.getName() + " IN " + school.getAddress() + "  the hotline is " + school.getPhonenumber());
        String action;
        do {
            System.out.println("what do you want : ");
            Scanner sc = new Scanner(System.in);
            action = sc.next();
            switch (action) {

                case "addstudent":
                    HMI.addstudent();
                    break;
                case "addteacher":
                    HMI.addteacher();
                    break;
                case "printstudent":
                    HMI.printstudent();
                    break;
                case "printteacher":
                    HMI.printteacher();
                    break;
                case "getstudentbyname":
                    HMI.getstudentbyname();
                    break;
            }

        } while (!action.equals("excit"));

    }

    private static school createschool() {
        school school = new school();
        school.setName("nasser");
        school.setAddress("kom-hamada");
        school.setPhonenumber("010233");
        HMI.schoolservices = new schoolservices(school);
        return school;

    }

    public static void addstudent() {
        student student = new student();
        dataperson(student);
        schoolservices.addstudent(student);

    }

    public static void addteacher() {
        teacher teacher = new teacher();
        dataperson(teacher);
        schoolservices.addteacher(teacher);

    }

    public static void printstudent() {
        for (student student : schoolservices.getSchool().getStudents()) {
            System.out.println("student name is " + student.getName() + "  her age is " + student.getAge() + "number of parent is " + student.getParentphonenumber());
        }

    }

    public static void printteacher() {
        for (teacher teahcer : schoolservices.getSchool().getTeachers()) {
            System.out.println("teahcer name is " + teahcer.getName() + "  her age is " + teahcer.getAge() + " her salary is " + teahcer.getSalary());
        }
    }

    private static void dataperson(person p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre student name : ");
        p.setName(sc.next());
        System.out.println("Entre student age : ");
        p.setAge(sc.nextInt());
        if (p instanceof student) {
            System.out.println("Entre student parent-NUM : ");
            ((student) p).setParentphonenumber(sc.next());
        }
        if (p instanceof teacher) {
            System.out.println("Entre your salary : ");
            ((teacher) p).setSalary(sc.nextFloat());
        }
    }

    public static void getstudentbyname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre student name");
        String name=sc.next();
        student student=schoolservices.getstudentname(name);
        System.out.println(student.getName() +student.getAge());
    }
}
