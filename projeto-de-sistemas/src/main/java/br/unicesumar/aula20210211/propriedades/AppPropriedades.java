package br.unicesumar.aula20210211.propriedades;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppPropriedades {

    public static void main(String[] args) {

        formaConvencionalComTryCatchFinallyComForParaPercorrer();
        System.out.println("=================================");
        formaModernaComTryWithResourcesComLambdaParaPercorrer();
        
    }

    private static void formaModernaComTryWithResourcesComLambdaParaPercorrer() {
        Properties config = new Properties();

        try (InputStream input = AppPropriedades.class.getResourceAsStream("config.properties");) {
            System.out.println("Arquivo aberto.");
            System.out.println("Lendo as propriedades do arquivo...");
            config.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        System.out.println("Arquivo fechado.");
        System.out.println("Listagem das propriedades lidas:");
        config.stringPropertyNames().forEach(nome -> { 
            System.out.println(nome + " ==> " + config.get(nome));
        });

    }

    private static void formaConvencionalComTryCatchFinallyComForParaPercorrer() {
        Properties config = new Properties();

        InputStream input = null;
        try {
            System.out.println("Abrindo o arquivo...");
            input = AppPropriedades.class.getResourceAsStream("config.properties");
            System.out.println("Lendo as propriedades do arquivo...");
            config.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    System.out.println("Fechando o arquivo...");
                    input.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Listagem das propriedades lidas:");
        for (String nome : config.stringPropertyNames()) {
            System.out.println(nome + " ==> " + config.get(nome));
        }    
    }
    
}
