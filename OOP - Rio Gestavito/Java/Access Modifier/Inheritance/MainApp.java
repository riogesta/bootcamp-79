import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class MainApp {
    public static void main(String [] args) {
        
        Person person1 = new Programmer("Rio", "Bandung", "Rust");
        Person person2 = new Teacher("Sikri", "Banjaran", "B. Indonesia");
        Person person3 = new Doctor("Rofik", "Banjaran", "Pedistrician");
        

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
        
    }   
    
    static void sayHello(Person person){
        String message;

        if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            message = "Hello, "+ programmer.name +". seorang programmer "+ programmer.technology +".";
        } else if (person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            message = "Hello, "+ teacher.name +". seorang guru "+ teacher.subject +".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, "+ doctor.name +". seorang dokter "+doctor.specialist+".";
        } else {
            message = "Hello, "+ person.name +".";
        }
        System.out.println(message);

    }
}
