public class Programmer extends Person {
    String technology;

    public Programmer() {
        super();
    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    void coding() {
        System.out.println("i can create a application using technology : "+technology+".");
    }

    void hacking() {
        System.out.println("i can hacking a website");
    }

    @Override
    void greeting() {
        super.greeting(); // memanggil method greeting dari parent atau Person class
        System.out.println("my job is a "+technology+" programmer");
    }
}
