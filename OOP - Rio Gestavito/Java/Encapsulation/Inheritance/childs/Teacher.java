package childs;
import parents.Person;

public class Teacher extends Person{
    private String subject;

    public Teacher() {

    }

    public Teacher(String name, String address, String subject){
        super(name, address);
        this.subject = subject;
    }

    void teaching() {
        System.out.println("i can teach "+subject+", so anyone how wants to learn can talk to me");
    }

    public void greeting() {
        System.out.println("Hello my name is "+getName()+".");
        System.out.println("i come from "+getAddress()+".");
        System.out.println("my job is a "+subject+" teacher.");
    }

    // getter dan setter
    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
