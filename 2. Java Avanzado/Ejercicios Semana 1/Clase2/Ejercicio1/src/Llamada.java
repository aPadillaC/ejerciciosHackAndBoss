public class Llamada {

    private String name;
    private String dudas;
    private String infoLlamada;


    public Llamada(String name, String dudas, String infoLlamada) {
        this.name = name;
        this.dudas = dudas;
        this.infoLlamada = infoLlamada;
    }

    public String getName() {
        return name;
    }

    public String getDudas() {
        return dudas;
    }

    public String getInfoLlamada() {
        return infoLlamada;
    }
}
