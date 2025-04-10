package bank.semaforo.binario;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import bank.semaforo.binario.model.Bank;


public class Main {
    public static void main(String[] args) {
        System.out.println("Luis Gerardo Tax Mantanico");
        System.out.println("Sistema de control de acceso  para un banco utilizando semaforo binario");
        Bank bank = new Bank(3);
        Thread client1 = new Thread(()-> bank.entered_bank("Cliente1"));
        Thread client2 = new Thread(()-> bank.entered_bank("Cliente2"));
        Thread client3 = new Thread(()-> bank.entered_bank("Cliente3"));
        Thread client4 = new Thread(()-> bank.entered_bank("Cliente4"));
        Thread client5 = new Thread(()-> bank.entered_bank("Cliente5"));

        client1.start();
        client2.start();
        client3.start();
        client4.start();
        client5.start();
    }
}