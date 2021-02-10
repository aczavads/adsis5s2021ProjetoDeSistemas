package br.unicesumar.aula20210210.singleton;

public class Universo {
    private static Universo oUniverso = null;

    private Universo() {
        System.out.println("Invocando o construtor de Universo...");
    }

    public static Universo getInstance() {
        if (oUniverso == null) {
            oUniverso = new Universo();
        }
        return oUniverso;
    }

}
