package kasp4770;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

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

        ArrayList<DatHoldet> dat1 = new ArrayList<>();
        dat1.add(elev1);
        dat1.add(elev2);
        dat1.add(elev3);
    }
}
