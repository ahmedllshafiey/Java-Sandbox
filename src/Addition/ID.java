package Addition;

public class ID {

    public static void showId(Father g) {
        if (g instanceof Son) {
            Son s = (Son) g;
            s.cam = 3;
            System.out.println(s.cam);
        } else if (g instanceof Doctor) {
            Doctor d = (Doctor) g;
            d.speciality = "Pediatric";
            System.out.println(d.speciality);
        }
    }
}
