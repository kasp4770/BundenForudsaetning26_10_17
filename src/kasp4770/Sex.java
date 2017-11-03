package kasp4770;

public enum Sex { M("Mand"), F("Kvinde"), NA("*Køn ej defineret*");

private String s;

public String s(){  //en metode som returnerer et String som er tilknyttet en enum-værdi
    return this.s; }

    Sex(String s){ //constructor som tilknytter enumværdier til metode
        this.s = s;
    }
}
