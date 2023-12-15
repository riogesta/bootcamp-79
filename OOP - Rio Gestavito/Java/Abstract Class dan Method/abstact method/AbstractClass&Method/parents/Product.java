package parents;

public abstract class Product {
    private String name;

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract method printInformation
    public abstract void printInformation();
}