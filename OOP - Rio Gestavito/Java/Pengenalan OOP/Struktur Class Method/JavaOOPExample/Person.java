public class Person {
    String name;
    String address;
    final String country = "indonesia";

    void sayHello(String paramName){
        System.out.println("Hello "+paramName+", my name is "+name+".");
    }

    String sayAddress(){
        return "i, come from "+address+".";
    }
} 
