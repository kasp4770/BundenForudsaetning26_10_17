package kasp4770;
/*Mit eksempel på enumerated type. Vi lærte det mest basale; at lave en enum klasse med enum typer, og forskellig brug
* af dem. Hvad vi ikke lærte i lektionerne var at man kunne lave metoder og constructors i enum, så man f.eks. kan ud-
* skrive en String i forbindelse med brugen af enum type.
* Jeg har ikke forståelsen for enum metoder, constructors, Strings osv. 100% endnu, men har lavet et par kommentarer som
* indikerer hvordan jeg har forstået det.
* */
public enum Sex { M("Mand"), F("Kvinde"), NA("*Køn ej defineret*");

private String s;

public String s(){  //en metode som returnerer et String som er tilknyttet en enum-værdi
    return this.s; }

    Sex(String s){ //constructor som tilknytter enumværdier til metode
        this.s = s;
    }
}
