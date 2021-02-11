package br.unicesumar.aula20210210.singleton;

public class Universo {
    //- oUniverso : Universo = null 
    //  ---------------------------  ==> sublinhado, indicando static
    private static Universo oUniverso = new Universo();

    //- Universo()
    private Universo() {
        System.out.println("Invocando o construtor de Universo...");
    }

    //+ getInstance() : Universo
    //--------------------------  ==> sublinhado, indicando static
    public static Universo getInstance() {
        /*
        if (oUniverso == null) {
            oUniverso = new Universo();
        }
        */
        return oUniverso;
    }

    public static int getVersion() {
        return -1;
    }

}
