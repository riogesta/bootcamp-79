public class MainApp {
    public static void main(String [] args) {
        
        // object programmer menggunakan construktor default
        Programmer programmer1 = new Programmer();
        programmer1.name = "Rio";
        programmer1.address = "Bandung";
        programmer1.technology = "Rust";

        // object doctor menggunakan constructor berparameter
        Programmer programmer2 = new Programmer("Naruto", "konoha", "javascript");
        programmer1.greeting();
        System.out.println();

        programmer2.greeting();
    }    
}
