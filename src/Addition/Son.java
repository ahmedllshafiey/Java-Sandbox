package Addition;

public class Son extends Father {

    int cam;

    public Son(int id) {
        super(id);
    }

    public int getCam() {
        return cam;
    }

    public void setCam(int cam) {
        this.cam = cam;
    }

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

    @Override // Chnage code of super class
    void print() {
        super.print();
        System.out.println(cam);
    }

}
