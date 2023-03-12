
package academy;
public class student extends person{
    String parentphonenumber;

    public student() {
    }

    public student(String parentphonenumber) {
        this.parentphonenumber = parentphonenumber;
    }

    public student(String name, int age,String parentphonenumber) {
        super(name, age);
        this.parentphonenumber = parentphonenumber;
    }

    public String getParentphonenumber() {
        return parentphonenumber;
    }

    public void setParentphonenumber(String parentphonenumber) {
        this.parentphonenumber = parentphonenumber;
    }
    
    
}
