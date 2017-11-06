package kasp4770;

public interface Academy { //Alle fælles konstanter og metoder for klasser samles her.

    //Et eksempel på variabler i et interface
    String sem1 = " 2017"; //final static pr. definition
    String sem3 = " 2016";
    String sem5 = " 2015";

    String getFname();
    String getLname();
    Sex getSex();
    String getDescription(); // public abstract pr. definition

}
