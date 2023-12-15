public class Categories {
    // menggunakan access modifier private pada field atau attribute
    private int id;
    private String name;
    private boolean expensive;

    public Categories(int id, String name, boolean expensive) {
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    public Categories() {

    }

    // method getter setter
    // getter
    public boolean isExpensive() {
        return this.expensive;
    }

    // setter
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    // tipe data object
    // getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // tipe data primitif (int)
    // getter
    public int getId() {
        return this.id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }
}