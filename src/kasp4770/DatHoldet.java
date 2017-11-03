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

    //Metode til at hente dato for oprettelse af objekt
    public String toString(){
        return "Oprettet d. " + dateCreated;
    }

    //Abstract metode til beskrivelse af objekt. Alle subklasser kan hente og override'e metoden.
    public String getDescription(){
        return "Datamatiker" + toString();
    }
}

