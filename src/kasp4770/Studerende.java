package kasp4770;

public class Studerende extends DatHoldet{

    private String fname = "N/A";
    private String lname = "N/A";
    private Sex sex; //Deklarerer variabel 'sex' så jeg kan bruge enum i metoder (bl.a. i sammenhæng med Switch)
    private int age = 0;
    private String hold = "No course attached";
    private String tlf = "No phone number attached";


    //Constructor som kræver fornavn, efternavn og køn angivet
    public Studerende(String fname, String lname, Sex sex) {
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
    }

    //constructor som kræver alle info angivet: navn, køn, alder, hold og telefon nummer
    public Studerende(String fname, String lname, Sex sex, int age, String hold, String tlf){
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
        this.age = age;
        this.hold = hold;
        this.tlf = tlf;

    }

    //Set metoder
    public void setFname(String fn){
        fname = fn;
    }
    public void setLname(String ln){
        lname = ln;
    }
    public void setSex(Sex s) { sex = s; }
    //Når man bruger samme variabel i metodearg. som den klassevariabel man henviser til, er 'this.' påkrævet, for at
    // compileren ved at det er objektet man henviser til.
    public void setAge(int age){ this.age = age; }
    public void setHold(String hold){
        this.hold = hold;
    }
    public void setTlf(String tlf){
        this.tlf = tlf;
    }

    //Get metoder
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public Sex getSex() { return sex;}
    public int getAge(){
        return age;
    }
    public String getHold(){
        return hold;
    }
    public String getTlf(){
        return tlf;
    }

    //override'er toString() fra DatHoldet, men bruger alligevel DatHoldet's toString() (super.toString();)
    public String toString(){ return super.toString(); }

    //metode som returnerer beskrivelse af elev. Nedenunder er et (udkommenteret) eksempel mere, som også returnerer
    //beskrivelse efter køn, dog med brug af switch
    public String getDescription(){
        if(getSex() == Sex.M){
            System.out.print("Elevinfo for elev af køn: " + Sex.M.s());
        }
        else if(getSex() == Sex.F){
            System.out.print("Elevinfo for elev af køn: " + Sex.F.s());
        }
        else if(getSex() == Sex.NA){
            System.out.print("Elevinfo for elev af køn: " + Sex.NA.s());
        }
        //else if(getSex() == null){                  - Udkommenteret da jeg ikke har angivet en no-arg constructor
        //    System.out.println("Elevinfo for: ");     eller en constructor som ikke kræver køn angivet. Derfor kan
        //}                                             'null' ikke hænde.
        return "\nNavn: " + getFname() +" "+ getLname() +
                //"\nKøn: " + getSex() +              - linje hører sammen med ovenstående (udkommenteret else if statement)
                "\nAlder: " + getAge() +
                "\nHold: " + getHold() +
                "\nTelefon nr.: " + getTlf();
    }
    /*
    //Metode som returnerer beskrivelse af elev. Køn afgører hvilken beskrivelse eleven får.
    public String getDescription() {
        switch(sex){
            case NA:
                System.out.println("Flink, flittig og ambitiøs elev");break;
            case F:
                System.out.println("Flink, flittig og ambitiøs dame");break;
            case M:
                System.out.println("Flink, flittig og amitiøs herre");
        }
        System.out.println(
                "Elevens fornavn og efternavn: "+ getFname() + " " + getLname() +
                        "\nAlder: " + getAge() +
                        "\nHold: " + getHold() +
                        "\nTelefonnummer: " + getTlf());
        return super.toString() + sex;
    }*/

}
