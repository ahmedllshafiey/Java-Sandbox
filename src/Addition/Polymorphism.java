package Addition;

public class Polymorphism {

    // Polymorphism used when Inheritance used
    // How to do polymorphism - Reference(super class type) with object(sub class type)
    // Only props and methods of parent can be used
    // Why polymorphism - use one referance for more than on object at the same reference to save memory
    public static void main(String[] args) {
        
        Father d = new Doctor(0);
        Father s = new Son(1);
        //Father super class = new Son/Doctor sub class

        // First from of polymorphism
        // s - Polymorephic reference
        // Second from of polymorphism - Heteroegnous Array
        Father[] E = {new Son(0), new Doctor(0)};

        // Third from of polymorphism
        d.print(); // if override java run methods of object not reference in case of polymorphism

        // Forth from of polymorphism - polymorphic argument - children of the same class same type when used as parameters for external method
        ID.showId(s);
        ID.showId(d);
    }
}
