package br.unicesumar.aula20210218.herançaComSingleton;

import br.unicesumar.aula20210210.singleton.Universo;

/*
Se precisássemos de uma classe derivada do Universo seria complicado fazer isso, pois
o construtor privado de Universo impede que subclasses sejam declaradas. A alternativa 
seria declarar a classe Multiverso no mesmo pacote que Universo e trocar o modificador do 
construtor de private para protected, de modo a permitir que subclasses usem o construtor.
Mas isso já começa a degradar a estrutura do Singleton... ou seja, Singleton não lida
muito bem com herança.
*/

public class Multiverso /*extends Universo*/ {

    /*
    private Multiverso() {

    }
    */

}
