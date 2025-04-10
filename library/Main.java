
package library;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import library.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Luis Gerardo Tax Mantanico");
        System.out.println("Sistema de control de acceso  para una biblioteca  utilizando semaforo contador ");
        // Library library = new Library(3);
        Library library = new Library(3);

        Thread library1 = new Thread(()-> library.entered_library("librarye1"));
        Thread library2 = new Thread(()-> library.entered_library("librarye2"));
        Thread library3 = new Thread(()-> library.entered_library("librarye3"));
        Thread library4 = new Thread(()-> library.entered_library("librarye4"));
        Thread library5 = new Thread(()-> library.entered_library("librarye5"));
        Thread library6 = new Thread(()-> library.entered_library("librarye6"));
        Thread library7 = new Thread(()-> library.entered_library("librarye7"));
        Thread library8 = new Thread(()-> library.entered_library("librarye8"));
        Thread library9 = new Thread(()-> library.entered_library("librarye9"));
        Thread library10 = new Thread(()-> library.entered_library("librarye10"));

        library1.start();
        library2.start();
        library3.start();
        library4.start();
        library5.start();
        library6.start();
        library7.start();
        library8.start();
        library9.start();
        library10.start();
    }
}