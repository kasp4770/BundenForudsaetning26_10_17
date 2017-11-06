package kasp4770;

import java.util.Scanner; //Importerer Scannerklassen.

public class MineMetoder {

    Scanner input = new java.util.Scanner(System.in); //Nyt scanner objekt

    //No arg constructor til at lave et objekt som kan kalde på mine metoder
    public MineMetoder(){}

    private int karakter = 0; //Deklarerer og initialiserer variabel
    private int sum = 0;
    //Et while loop med bruger input til at taste en karakter mellem 0-100

    public void whileLoop(){
        while(karakter != -1){//koden afsluttes først når bruger indtaster -1
            sum += karakter;
            System.out.print("Indtast din karakter: " );
            karakter = input.nextInt(); //Initaliserer variabel på ny ved brugerindtastning
            //If-else statements som udprinter et resultat af brugerens indtastning
            if(karakter >=0 && karakter < 60){ //hvis brugerens indtastning er over eller lig med 0 OG under 60
                System.out.println("Du har ikke bestået eksamenen. For at afslutte, tast -1");
            }
            if(karakter > 60 && karakter <=100){//hvis brugerens indtastning er over 60 OG under eller lig med 100
                System.out.println("Du har bestået eksamenen. For at afslutte, tast -1");
            }
            else if (karakter <-1 || karakter > 100){//hvis brugerens indtastning er under -1 ELLER over 100
                System.out.println("Din karakter er ikke mellem 0 og 100");
            }
        }
        System.out.println("Dine samlede point er: " + sum);
    }
    //et Do-While loop som giver samme resultat som ovenstående whileloop
    public void doWhileLoop(){
        do{
            System.out.print("Indtast din karakter: ");
            karakter = input.nextInt();

            //If-else statements som udprinter et resultat af brugerens indtastning
            if(karakter >=0 && karakter < 60){ //hvis brugerens indtastning er over eller lig med 0 OG under 60
                    System.out.println("Du har ikke bestået eksamenen. For at afslutte, tast -1");
            }
            if(karakter > 60 && karakter <=100){//hvis brugerens indtastning er over 60 OG under eller lig med 100
                    System.out.println("Du har bestået eksamenen. For at afslutte, tast -1");
            }
            else if (karakter <-1 || karakter > 100){//hvis brugerens indtastning er under -1 ELLER over 100
                    System.out.println("Din karakter er ikke mellem 0 og 100");
            }
            sum += karakter;
        } while(karakter != -1);
        System.out.println("Dine samlede point er: " + sum);
    }

    public void forLoop(){ //bruger for-loop når vi ved hvor mange gange programmet skal køre

        int[] diplom = new int[4]; //Opretter et array med 4 rækker, fra 0 til 3

        //initialiserer array med bruger input
        System.out.println("Indtast dine " + diplom.length + " karakterer");
        for(int i = 0; i < diplom.length; i ++) //int i starter fra 0 og kører til og med 3, dvs. 4 gange i dette tilfælde
            diplom[i] = input.nextInt();

        //Udprint af array
        for(int i = 0; i < diplom.length; i ++){
            System.out.print(diplom[i] + " "); //for hvert loop udprint, er der et mellemrum mellem værdierne
        }
        //Finder summen af værdierne i array, og udprinter gennemsnittet
        double sum = 0;
        for(int i = 0; i < diplom.length; i ++){
            sum += diplom[i];
        }
            System.out.println("\nDit gennemsnit er " + sum / diplom.length);
    }

//Her prøvede jeg mig frem med metoder som ville skabe og returnere et array efter brugerindtastning, men jeg fik det
//aldrig til at virke. Jeg har prøvet meget og det der er tilbage er ikke mit bedste forsøg
// Det var her jeg ville demonstrere for-loops til at lave et array.
/*
    public int[] getArrayOfScores(){
        System.out.println("Hvor mange fag har du afsluttet?: ");
        int score = input.nextInt();

        int[] scoresList = new int[score];
        System.out.println("Indtast dine " + scoresList.length + " karakterer: ");

        for (int i=0; i < scoresList.length; i++) {
            scoresList[i] = input.nextInt();
        }
        return scoresList[i];
    }

    public void setArrayOfScores(int score){
        this.scoresList = new int[score];
        int i = 0;
        for (i = 0; i < scoresList.length; i++){
        this.scoresList[i] = input.nextInt();
        }
    }
*/


}
