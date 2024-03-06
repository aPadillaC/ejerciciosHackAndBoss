import java.util.ArrayList;
import java.util.List;

public class Agente extends Thread{

    private int idAgente;
    List<Llamada> listadoLLamadas;

    public Agente(int idAgente) {
        listadoLLamadas = new ArrayList<>();

        this.idAgente = idAgente;
    }

    public void recibirLlamadas( Llamada llamada ) {

        listadoLLamadas.add(llamada);

    }


    @Override
    public void run() {

        for ( int i = 0 ; i < listadoLLamadas.size(); i++) {

            System.out.println("Agente " + this.idAgente + " en la llamada " + listadoLLamadas.get(i).getName());

            try {
                Thread.sleep(4000);
                System.out.println("Agente " + this.idAgente + " ha finalizado la llamada con el cliente " + listadoLLamadas.get(i).getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
