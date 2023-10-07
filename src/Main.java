
public class Main {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Dell", "Latitudine", 15.6, 16);
        Laptop hp = new Laptop("HP", "HP 200", 14, 8);
        Laptop asus = new Laptop("ASUS", "2500", 15.6, 32, "alb");

        Carte carte = new Carte("Amintiri din copilarie", "Ion Creanga", 200,"galben");

        System.out.println(carte); //---

        Student student1 = new Student("Chiaburu", "Mihaela", 21, "FI-221");
        Student student2 = new Student("Dandis", "Gheorghe", 20, "FI-221");
        Student student3 = new Student("Moraru", "Cristian", 30, "FI-221");
        student1.setGrupa("TI-222");
        System.out.println(student1);

        System.out.println(dell.getProducator());
        System.out.println(dell.getModel());
        System.out.println(dell.getDimensiuniEcran());
        System.out.println(dell.getMemoriaOperativa());
        System.out.println(dell.getCuloare());
        System.out.println();

        System.out.println(hp.getProducator());
        System.out.println(hp.getModel());
        System.out.println(hp.getDimensiuniEcran());
        System.out.println(hp.getMemoriaOperativa());
        System.out.println(hp.getCuloare());
        System.out.println();

        asus.setMemoriaOperativa(16);

        System.out.println(asus.getProducator());
        System.out.println(asus.getModel());
        System.out.println(asus.getDimensiuniEcran());
        System.out.println(asus.getMemoriaOperativa());
        System.out.println(asus.getCuloare());
    }
}