package br.unicesumar.aula20210217.singletonParaPropriedades;

public class AppSingletonParaPropriedades {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //GerenciadorDePropriedades gerenciador = new GerenciadorDePropriedades();      
            GerenciadorDePropriedades gerenciador = GerenciadorDePropriedades.getInstance();      
            System.out.println(gerenciador.getValorDaPropriedade("sigla-do-pais") + "-" + gerenciador.getValorDaPropriedade("nome-do-pais"));                  
        }
    }
}
