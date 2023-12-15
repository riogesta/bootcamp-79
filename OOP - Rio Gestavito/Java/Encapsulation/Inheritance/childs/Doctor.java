package childs;
import parents.Person;

public class Doctor extends Person{
    private String specialist;

    public Doctor() {

    }

    public Doctor(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }

    void surgery() {
        System.out.println("i can surgery operation patients");
    }

    public void greeting() {
        System.out.println("Hello my name is "+getName()+".");
        System.out.println("i come from "+getAddress()+".");
        System.out.println("My Occupation is a "+specialist+" doctor.");
    }

    // getter dan setter
    public String getSpecialist() {
        return this.specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
