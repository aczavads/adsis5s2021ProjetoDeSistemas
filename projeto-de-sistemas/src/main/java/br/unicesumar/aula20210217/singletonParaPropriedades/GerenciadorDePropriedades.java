package br.unicesumar.aula20210217.singletonParaPropriedades;

import java.io.InputStream;
import java.util.Properties;

public class GerenciadorDePropriedades {
    //- instance : GerenciadorDePropriedades = null
    private static GerenciadorDePropriedades instance = null;
    private static final String NOME_ARQUIVO_PROPRIEDADES = "propriedades.properties";
    private Properties propriedades = new Properties();

    private GerenciadorDePropriedades() {
        carregarPropriedadesDoArquivo();
    }

    //+ getInstance() : GerenciadorDePropriedades
    public static GerenciadorDePropriedades getInstance() {
        if (instance == null) {
            instance = new GerenciadorDePropriedades();
        }
        return instance;
    }

    private void carregarPropriedadesDoArquivo() {
        try (InputStream input = GerenciadorDePropriedades.class.getResourceAsStream(NOME_ARQUIVO_PROPRIEDADES);) {
            System.out.println("Lendo as propriedades do arquivo...");
            propriedades.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    //+ getValorDaPropriedade(nomeDaPropriedade : String) : String
    public String getValorDaPropriedade(String nomeDaPropriedade) {
        return propriedades.getProperty(nomeDaPropriedade);
    }

}
