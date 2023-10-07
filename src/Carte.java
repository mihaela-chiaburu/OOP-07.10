public class Carte {
    private String nume;
    private String autor;
    private int nrPagini;
    private String culoare;

    public Carte (String nume, String autor, int nrPagini, String culoare){
        this.nume = nume;
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.culoare = culoare;
    }

    public String getNume(){
        return this.nume;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getNrPagini(){
        return this.nrPagini;
    }
    public String getCuloare(){
        return this.culoare;
    }

    public void setNrPagini(int nrPagini){
        this.nrPagini = nrPagini;
    }
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }
    //@Override
    public String toString() {
        return "\nCarte: ["
                + "nume: " + this.nume + "\n" +
                 "autor: " + this.autor + "\n" +
                 "pagini: " + this.nrPagini + "\n" +
                 "culoare: " + this.culoare + "]\n" ;

    }


}
