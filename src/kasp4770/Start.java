package kasp4770;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        System.out.println("-- DEL 1 --\n");
        //DEL 1: Her viser jeg hvordan man opretter Studerende.java objekter, og hvordan metoderne tilgås.
        //Resultatet er en udprintning af de data som objektet har tilknyttet ved hjælp af getDescription.

        Studerende elev1 = new Studerende("Kasper", "Petersen", Sex.M, 26,
                "Datamatiker", "+4561408507");
        System.out.println(elev1.getDescription()+Academy.sem1 + "\n" + elev1.toString());
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

        //loop som gennemgår hele listen af objekter og udfører nedenstående kode for hvert loop: udskriver data for elever
        for(int i = 0; i < dat1.size(); i++){
            System.out.println(((Studerende)dat1.get(i)).getDescription() + "\n");//Object casting DatHoldet->Studerende
        }

        System.out.println("\n-- DEL 3 --\n");
        //Her viser jeg en skjult arraylist
        //Programmet går ud på at simulere et afkrydsningsskema for fremmødte elever
        DatHoldet course1 = new DatHoldet(Course.PROG); //nedkalder en constructor som laver en udskrivning

        /* I DatHoldet.java har jeg lavet et override af add() metoden fra ArrayList. Det gør at når jeg laver et
        DatHoldet objekt og bruger min addStuderende(), bliver objektet automatisk til et ArrayList objekt*/
        course1.addStuderende(elev1);
        course1.addStuderende(elev2);
        course1.addStuderende(elev3);
        course1.addStuderende(elev4);

        for(int i = 0; i < course1.size(); i++){
            System.out.println(((Studerende)course1.get(i)).getFname() + " " + ((Studerende)course1.get(i)).getLname());
        }
        System.out.println("\n-- DEL 4 --\n");
        //Demonstration af plymorfi, intanceof og objectcasting, ved brug af displayObject() nederst i klassen.
        DatHoldet lektor1 = new Lektor("András", "Sándor", Sex.M);
        DatHoldet elev5 = new Studerende("Bruno", "Nielsen", Sex.M, 28,
                "Datamatiker", "+4579408528");
        DatHoldet elev6 = new Studerende("Frederikke", "Frandsen", Sex.F, 20,
                "Datamatiker", "+4524808507");

        System.out.println("Information om faget " + Course.PROG.c() + ":");
        displayObject(lektor1);
        System.out.println("Elever: ");
        displayObject(elev5);
        displayObject(elev6);

    }
    public static void displayObject(DatHoldet datHoldet) {
        if (datHoldet instanceof Studerende) {
            System.out.println(((Studerende) datHoldet).getFname() + " "
                    + ((Studerende) datHoldet).getLname()); //Explicit Casting
        } else if (datHoldet instanceof Lektor) {
            System.out.println(((Lektor) datHoldet).getDescription()); //Explicit Casting
        }
    }
}
