public class MainApp {
    public static void main(String [] args) {
        Person person2 = new Person();
        person2.name = "rio";
        person2.address = "bandung";

        person2.sayHello("padepokan 79");
        System.out.println(person2.sayAddress());
    }    
}
