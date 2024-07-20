package Addition;

public class Father {

    int id;
    String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Father(int id) {
        this.id = id;
    }

    void call() {
        System.out.println("Calling");
    }

    void end() {
        System.out.println("Ending");
    }

    void print() {
        System.out.println(id);
        System.out.println(color);
    }
}
