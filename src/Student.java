public class Student {
    private String nume;
    private String prenume;
    private int varsta;
    private String grupa;

    public Student (String nume, String prenume, int varsta, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.grupa = grupa;
    }
    public String getNume(){
        return this.nume;
    }
    public String getPrenume(){
        return this.prenume;
    }
    public int getVarsta(){
        return this.varsta;
    }
    public String getGrupa(){
        return this.grupa;
    }
    public void setGrupa(String grupa){
        this.grupa=grupa;
    }

    public String toString(){
        return "\n" + this.nume + " " + this.prenume
                + "\n" + this.varsta + "\n" +
                this.grupa + "\n" ;
    }
}
