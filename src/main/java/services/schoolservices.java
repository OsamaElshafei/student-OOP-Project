package services;

import academy.Grade;
import academy.school;
import academy.student;
import academy.teacher;

public class schoolservices {

    school School;

    public schoolservices(school School) {
        this.School = School;
    }

    public school getSchool() {
        return School;
    }

    public void addstudent(student student) {
        this.School.getStudents().add(student);
    }

    public void addteacher(teacher teacher) {
        this.School.getTeachers().add(teacher);
    }

    public void addgrade(Grade grade) {
        this.School.getGrades().add(grade);
    }

    public void removestudent(student student) {
        this.School.getStudents().remove(student);
    }

    public void removeteacher(teacher teacher) {
        this.School.getTeachers().remove(teacher);
    }

    public void removegrade(Grade grade) {
        this.School.getGrades().remove(grade);
    }

    public student getstudentname(String name) {
        student a = null;
        for (student student : this.School.getStudents()) {
            if (student.getName().equals(name)) {
                a = student;
                break;
            }
        }
        return a;
    }

    public teacher getteachername(String name) {
        for (teacher teacher : this.School.getTeachers()) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    public Grade getgrade(String code) {
        for (Grade grade : this.School.getGrades()) {
            if (grade.getCode().equals(code)) {
                return grade;
            }
        }
        return null;
    }

}
