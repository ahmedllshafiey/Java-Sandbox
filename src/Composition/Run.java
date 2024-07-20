package Composition;

public class Run {

    // Compositional Relationship means class have object from other class
    public static void main(String[] args) {
        User u = new User();
        u.setName("Maya");
        u.setPoppy(new Dog());

        u.getPoppy().setType("Lolo");

        System.out.println(u.getPoppy().getType().toLowerCase());
    }
}
