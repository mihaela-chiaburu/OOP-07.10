public class Laptop {
    private String producator;
    private String model;
    private double dimensiuniEcran; //inch
    private int memoriaOperativa;
    private String culoare = "gri";
    //Laptop() {}
    public Laptop(String producator, String model, double dimensiuniEcran, int memoriaOperativa) {
        this.producator=producator;
        this.model=model;
        this.dimensiuniEcran=dimensiuniEcran;
        this.memoriaOperativa=memoriaOperativa;
    }
    public Laptop(String producator, String model, double dimensiuniEcran, int memoriaOperativa, String culoare) {
        this.producator=producator;
        this.model=model;
        this.dimensiuniEcran=dimensiuniEcran;
        this.memoriaOperativa=memoriaOperativa;
        this.culoare=culoare;
    }

    public String getProducator(){
        return this.producator;
    }
    public String getModel(){
        return this.model;
    }
    public double getDimensiuniEcran(){
        return this.dimensiuniEcran;
    }
    public int getMemoriaOperativa(){
        return this.memoriaOperativa;
    }
    public String getCuloare(){
        return this.culoare;
    }
    public void setMemoriaOperativa(int memoriaOperativa){
        this.memoriaOperativa = memoriaOperativa;
    }
}
