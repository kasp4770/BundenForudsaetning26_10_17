package kasp4770;

/*Et interface til at samle fællesmetoder og konstanter til alle klasser som implementerer den.
Subklasser har pr. automatik implementeret et interface hvis dens superklasse har.
*/
public interface Description {
    //metode til beskrivelse af objekt. toString() er her override'et fra Object.java
    String toString(); //public abstract pr. definition
}
