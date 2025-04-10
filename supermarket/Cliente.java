package supermarket;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Cliente  implements Runnable{
    private BlockingQueue<String> cola;
     

    public Cliente (BlockingQueue<String> cola){
        this.cola = cola;
    }

    public void run(){
        int size = 10;
        try{
            for (int i = 1; i <=size; i++) {
             String  producto = "Producto No. "+i;
             System.out.println("Agregando producto "+ producto);
             cola.put(producto);
             Random random = new Random();
             int numero = random.nextInt(5)+1;
             int tiempo = 0;
             tiempo = tiempo * 1000;
             Thread.sleep(tiempo);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
