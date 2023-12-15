public class MainApp {
    public static void main(String [] args) {
        Person person1 = new Person();
        person1.name = "Adam";
        person1.address = "Cimahi";

        Teacher teacher1 = new Teacher();
        teacher1.name = "Sikri";
        teacher1.address = "Banjaran";
        teacher1.subject = "B, Indonesia";

        Doctor doctor1 = new Doctor();
        doctor1.name = "Rofik";
        doctor1.address = "Banjaran";
        doctor1.specialist = "Dentis";

        Programmer programmer1 = new Programmer();
        programmer1.name = "Rio";
        programmer1.address = "Bandung";
        programmer1.technology = "Rust";

        person1.greeting();
        teacher1.greeting();
        doctor1.greeting();
        programmer1.greeting();

    }    
}
