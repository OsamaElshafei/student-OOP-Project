package academy;

import java.util.ArrayList;

public class school {

    String name;
    String address;
    String phonenumber;
    ArrayList<teacher> teachers;
    ArrayList<student> students;
    ArrayList<Grade> grades;

    public school() {
        this.intobject();
    }

    public school(String name) {
        this.name = name;
        this.intobject();
    }

    private void intobject() {
        this.students = new ArrayList<student>();
        this.teachers = new ArrayList<teacher>();
        this.grades = new ArrayList<Grade>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public ArrayList<teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<student> getStudents() {
        return students;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

}
