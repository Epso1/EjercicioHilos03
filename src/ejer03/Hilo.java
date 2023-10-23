
package ejer03;


public class Hilo extends Thread {

    private Contador cont;
    private static int id = 0; // Inicializar el ID en 1
    private int hiloId; // ID del hilo actual

    public Hilo(Contador cont) {
        this.cont = cont;
        id++; // Aumenta el valor de ID en el constructor
        this.hiloId = id; // Asigna el ID del hilo actual

    }

    @Override
    public void run() {
        cont.incrementarContador(hiloId);
    }
}