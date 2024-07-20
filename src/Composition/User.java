package Composition;

public class User {

    private int id;
    private String name;
    private Dog poppy;

    public Dog getPoppy() {
        return poppy;
    }

    public void setPoppy(Dog poppy) {
        this.poppy = poppy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
