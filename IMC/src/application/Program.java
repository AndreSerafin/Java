package application;

import java.util.Locale;

public class Program {

    public static final int WIDHT = 310, HEIGHT = 150; // muda tamanho da janela

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Window j1 = new Window(WIDHT,HEIGHT,"Calculadora de IMC");
    }
}
