
package ejer03;

import java.util.concurrent.atomic.AtomicInteger;


public class Contador {
    private AtomicInteger contador = new AtomicInteger();

    public int getContador() {
        return this.contador.get();
    }
    
    

   
    public void incrementarContador(int idHilo) {

        for (int i = 0; i < 500; i++) {
            contador.incrementAndGet();
            System.out.println("Hilo " + idHilo + " lleva " + (i + 1) + " vueltas.");
        }
        System.out.println("*****El hilo " + idHilo + " ha terminado*****");
    }
}