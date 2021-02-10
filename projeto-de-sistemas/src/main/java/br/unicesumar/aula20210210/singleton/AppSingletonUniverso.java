package br.unicesumar.aula20210210.singleton;

/**
 * Hello world!
 *
 */
public class AppSingletonUniverso {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            //Universo u = new Universo();
            Universo u = Universo.getInstance();
            System.out.println(u.toString());            
        }

    }


}
