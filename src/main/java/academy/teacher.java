
package academy;

public class teacher extends person{
   float salary;

    public teacher() {
    }

    public teacher(float salary) {
        this.salary = salary;
    }

    public teacher(String name, int age,float salary) {
        super(name, age);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
   
}
