package library.model;
import java.util.Random;
import java.util.concurrent.Semaphore;

public  class  Library {
    private Semaphore semaphore;
    public Library(int espacios){
     this.semaphore= new Semaphore(espacios);
    }

    public void entered_library(String student){
        try {
            semaphore.acquire();
            System.out.println(student + " ha entrado a la biblioteca");
            Random random = new Random();
            int numero = random.nextInt(5)+1;
            int tiempo = 0;
            tiempo = tiempo * 1000;
            Thread.sleep(tiempo);
            System.out.println("        "+student + " ha salido del biblioteca");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        }
    }