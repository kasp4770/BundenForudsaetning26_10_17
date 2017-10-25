package kasp4770;

import java.util.ArrayList;

public class Studerende {

    private String fname = "no fname";
    private String lname = "no lname";
    private int age = 0;
    private String hold = "noCourse";
    private String tlf = "noPhone";

    //no arg constructor
    public Studerende(){
        System.out.println("Ny elev er oprettet! ");
    }
    //Constructors med info
    public Studerende(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    public Studerende(String fname, String lname, int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    public Studerende(String fname, String lname, int age, String hold){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.hold = hold;
    }
    //constructor med alle info: navn, alder, hold og telefon nummer
    public Studerende(String fname, String lname, int age, String hold, String tlf){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.hold = hold;
        this.tlf = tlf;
    }

    //Set metoder
    public void setFname(){
        this.fname = fname;
    }
    public void setLname(){
        this.lname = lname;
    }
    public void setAge(){
        this.age = age;
    }
    public void setHold(){
        this.hold = hold;
    }
    public void setTlf(){
        this.tlf = tlf;
    }

    //Get metoder
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public int getAge(){
        return age;
    }
    public String getHold(){
        return hold;
    }
    public String getTlf(){
        return tlf;
    }

}
