package childs;

import parents.Product;

public class Item extends Product{

    private int price;

    public Item() {

    }

    public Item(String name, int price) {
        super(name);
        this.price = price;
    }

    // implementasi method abstract pada child class supaya menjadi bentuk konkrit dan jelas.
    @Override
    public void printInformation() {
        System.out.println("Product name : "+ getName());
        System.out.println("Product price : "+getPrice());
    }

    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}