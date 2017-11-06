package kasp4770;

import java.util.ArrayList;
import java.util.Date;
//Jeg extend'er ArrayList.java for at kunne override'e metoder uden at skulle omskrive metoderne, men bruger 'super'-keyword.
public class DatHoldet extends ArrayList {

    //Datafield
    private Course courseName; //Brugt i DEL 3.
    private java.util.Date dateCreated;

    //No-arg constructor
    public DatHoldet() {
        dateCreated = new java.util.Date();
    }
    //constructor
    protected DatHoldet(Course courseName){
        this.courseName = courseName;
        dateCreated = new java.util.Date();
        System.out.println("Fremmøde for " + courseName.c() + " d. " + getDateCreated());
    }

    public boolean addStuderende(Studerende elev){ //DEL 3 - override af boolean add(to ArrayList) fra ArrayList.java
        return super.add(elev);
    }
    public boolean addLektor(Lektor lektor){ //Overload som gør mig istand til at tilføje objekt fra Lektor.java
        return super.add(lektor);
    }

    //Metode til at hente dato for oprettelse
    public Date getDateCreated(){
        return dateCreated;
    }

    //Metode til at hente dato for oprettelse af objekt
    public String toString(){
        return "Oprettet d. " + dateCreated;
    }

}

