package kasp4770;

public class Lektor extends DatHoldet {

    private String fname = "N/A";
    private String lname = "N/A";
    private Sex sex;
    private String[][] hold;

    //Constructor
    public Lektor(String fname, String lname, Sex sex) {
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
    }

    //Get metoder
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public Sex getSex() {
        return sex;
    }
    public String[][] getHold() {
        return hold;
    }

    //Set metoder
    public void setHold(String[][] hold) {
        this.hold = hold;
    }

}
