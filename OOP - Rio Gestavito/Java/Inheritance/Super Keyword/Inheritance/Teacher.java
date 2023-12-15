public class Teacher extends Person{
    String subject;

    public Teacher() {

    }

    public Teacher(String name, String address, String subject){
        super(name, address);
        this.subject = subject;
    }

    void teaching() {
        System.out.println("i can teach "+subject+", so anyone how wants to learn can talk to me");
    }

    void greeting() {
        System.out.println("Hello my name is "+name+".");
        System.out.println("i come from "+address+".");
        System.out.println("my job is a "+subject+" teacher.");
    }
}
