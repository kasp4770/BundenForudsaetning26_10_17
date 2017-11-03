package kasp4770;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        System.out.println("-- DEL 1 --\n");
        //DEL 1: Her viser jeg hvordan man opretter Studerende.java objekter, og hvordan metoderne tilgås.
        //Resultatet er en udprintning af de data som objektet har tilknyttet ved hjælp af getDescription.

        Studerende elev1 = new Studerende("Kasper", "Petersen", Sex.M, 26,
                "Datamatiker", "+4561408507");
        System.out.println(elev1.getDescription() + "\n" + elev1.toString());
        System.out.println();

        Studerende elev2 = new Studerende("Lisa", "Hansen", Sex.F);
        System.out.println(elev2.getDescription() + "\n" + elev2.toString());
        System.out.println();

        Studerende elev3 = new Studerende("Flemming", "Mogensen", Sex.M);
        elev3.setAge(34); //Skolen får endelig angivet alderen på elev3
        System.out.println(elev3.getDescription() + "\n" + elev3.toString());
        System.out.println();

        elev3.setSex(Sex.F); //elev3 indgår en kønskifteoperation
        elev3.setFname("Flemmine"); //elev3 skifter til et mere feminimt navn
        System.out.println(elev3.getDescription() + "\n" + elev3.toString());

        Studerende elev4 = new Studerende("Michael", "Trans", Sex.M, 25,
                "Datamatiker", "+45 52365485");

        System.out.println("\n-- DEL 2 --\n");
        //DEL 2: Her viser jeg en smartere måde at vise alle oplysninger på objekterne på, ved at oprette en ArrayList
        //og udprinte data ved hjælp af et for-loop

        ArrayList<DatHoldet> dat1 = new ArrayList<>();
        dat1.add(elev1);
        dat1.add(elev2);
        dat1.add(elev3);
        dat1.add(elev4);

        //loop som gennemgår hele listen af objekter og udfører nedenstående kode for hvert loop
        for(int i = 0; i < dat1.size(); i++){
            System.out.println(((Studerende)dat1.get(i)).getDescription() + "\n");//Object casting DatHoldet->Studerende
        }
    }
}
