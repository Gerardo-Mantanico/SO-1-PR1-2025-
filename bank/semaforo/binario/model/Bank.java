package bank.semaforo.binario.model;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Bank {
   private Semaphore semaphore;
    public Bank(int espacios){

        this.semaphore= new Semaphore(espacios);
    }

    public void entered_bank(String client){
        try {
            semaphore.acquire();
            System.out.println(client + " ha entrado al banco");
            Random random = new Random();
            int tiempo = 0;
            tiempo = tiempo * 1000;
            Thread.sleep(tiempo);
            System.out.println("        "+client + " ha salido del banco");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
