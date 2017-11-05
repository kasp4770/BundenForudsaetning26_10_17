package kasp4770;

public enum Course { PROG("Programmering"), SYUD("Systemudvikling"), DATA("Database"), VIRK("Virksomhed");
    private String c;

    public String c(){
        return this.c;
    }
    Course (String c){
        this.c = c;
    }
}
