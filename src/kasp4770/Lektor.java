package kasp4770;

//Brugt i DEL 4 - Jeg har lavet endnu en subklasse for at demonstrere polymorfi og instanceof
public class Lektor extends DatHoldet implements Academy{

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
    public String getDescription(){
        if(getSex() == Sex.M){
            System.out.print("Lektor af køn: " + Sex.M.s());
        }
        else if(getSex() == Sex.F){
            System.out.print("Lektor af køn: " + Sex.F.s());
        }
        else if(getSex() == Sex.NA){
            System.out.print("Lektor af køn: " + Sex.NA.s());
        }
        return "\nNavn: " + getFname() +" "+ getLname();
    }

    //Set metoder
    public void setHold(String[][] hold) {
        this.hold = hold;
    }

}
