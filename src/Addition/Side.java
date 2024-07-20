package Addition;

// Simple Side class demonstrating basic attributes
public class Side {

    public int id;
    public String name;

    // Constructor
    public Side() {
        this.id = 1; // default id
        this.name = "Default Name"; // default name
    }

    // Constructor with parameters
    public Side(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display the side details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    void setSal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getSal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
