public class MainApp {
    public static void main(String [] args) {

        // membuat object dari class Person dengan menggunakan parameter
        Person person1 = new Person("Rio", "Bandung");
        person1.sayHello("Padepokan 79");
        System.out.println(person1.sayAddress());

        // membuat object dari class Person menggunakan constructor default
        Person person2 = new Person();
        person2.name = "Sikri";
        person2.address = "Banjaran";
        person2.sayHello("Padepokan 79");
        System.out.println(person2.sayAddress());

        // membuat object dari class Person dengan menggunakan constructor satu parameter
        Person person3 = new Person("Rofik");
        person3.address = "Banjaran";
        person3.sayHello("Padepokan 79");
        System.out.println(person3.sayAddress());

        
    }    
}
