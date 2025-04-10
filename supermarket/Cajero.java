package supermarket;

import java.util.concurrent.BlockingQueue;

public class Cajero implements Runnable {
    private BlockingQueue<String> cola;

    public Cajero(BlockingQueue<String> cola){
        this.cola=cola;
    }

    public void run(){
        try{
            while (true) {
                String producto = cola.take();
                System.out.println("    Cajero toma el "+producto);
                Thread.sleep(3000);
                if(cola.isEmpty()){
                    break;
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
