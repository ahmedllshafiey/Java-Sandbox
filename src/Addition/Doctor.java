package Addition;

public class Doctor extends Father {

    int medId;
    String speciality;

    public int getMedId() {
        return medId;
    }

    public void setMedId(int medId) {
        this.medId = medId;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(int id) {
        super(id);
    }

    @Override
    void print() {
        System.out.println(medId);
        System.out.println(speciality);
    }

}
