package supermarket;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) {

    BlockingQueue<String> cola = new LinkedBlockingDeque<String>(5);
    Thread cliente = new Thread(new Cliente(cola));
    Thread cajero = new Thread(new Cajero(cola));
  
    System.out.println("Luis Gerardo Marcelino Tax Mantanico");
    System.out.println("Implementacion de cola de mensajes en un supermercado");
    cliente.start();
    cajero.start();
    }    
}
