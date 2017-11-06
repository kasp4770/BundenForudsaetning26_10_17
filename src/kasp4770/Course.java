package kasp4770;
//Enum for fag
public enum Course { PROG("Programmering"), SYUD("Systemudvikling"), DATA("Database"), VIRK("Virksomhed");
    private String c;

    public String c(){
        return this.c;
    }
    Course (String c){
        this.c = c;
    }
}
