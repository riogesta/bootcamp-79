package childs;
import parents.Person;

public class Programmer extends Person {
    private String technology;

    public Programmer() {
        super();
    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public void coding() {
        System.out.println("i can create a application using technology : "+technology+".");
    }

    public void hacking() {
        System.out.println("i can hacking a website");
    }

    @Override
    public void greeting() {
        super.greeting(); // memanggil method greeting dari parent atau Person class
        System.out.println("my job is a "+technology+" programmer");
    }

    // setter dan getter
    public String getTechnology() {
        return this.technology;
    }

    public void setTechnology(String tech) {
        this.technology = tech;
    }
}
