package academy;

import java.util.ArrayList;

public class Grade {

    String code;
    String name;
    teacher teacher;
    ArrayList<student> students;

    public Grade(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<student> getStudents() {
        return students;

    }
}
