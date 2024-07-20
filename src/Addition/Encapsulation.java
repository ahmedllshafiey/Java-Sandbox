package Addition;

public class Encapsulation {

    public static void main(String[] args) {
        // no control || Why Encapsulation
        // 1 - Acess modifiers >> public, private
        // 2 - Setter, Getter Methods
        // Rules of Encapsulation >> AM for class >> public, default
        // public class used any where in project
        // defualt class only used in the package
        // AM for props, methods >> public, private, default, protected
        // public used any where in the project
        // private used only in the class
        // defualt used only within same package
        // protected used .. explained in Inheritance

        Side pack = new Side();
        pack.id = 1001;
        pack.setSal(3000);
        pack.name = "Ahmed";

        System.out.println("Salary is " + pack.getSal());
    }
}
