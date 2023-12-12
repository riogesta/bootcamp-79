package childs;
import parents.Person;

public class Doctor extends Person{
    public String specialist;

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
        System.out.println("Hello my name is "+name+".");
        System.out.println("i come from "+address+".");
        System.out.println("My Occupation is a "+specialist+" doctor.");
    }
}
