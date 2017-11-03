package kasp4770;

import java.util.Date;

public class DatHoldet implements Description {

    //Datafield
    private java.util.Date dateCreated;

    //no-arg constructor
    protected DatHoldet(){
        dateCreated = new java.util.Date();
    }

    //Metode til at hente dato for oprettelse
    public Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "Oprettet d. " + dateCreated;
    }
}

