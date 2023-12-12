public class Person {
    String name;
    String address;
    final String country = "indonesia";

    // constructor default
    Person() {

    }

    Person(String paramName) {
        name = paramName;
    }

    // constructor with parameters
    Person(String paramName, String paramAddress) {
        this(paramName);
        address = paramAddress;
    }

    // method
    void sayHello(String paramName){
        System.out.println("Hello "+paramName+", my name is "+name+".");
    }

    // method return value
    String sayAddress(){
        return "i, come from "+address+".";
    }
} 
