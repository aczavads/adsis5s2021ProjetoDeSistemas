package br.unicesumar.aula20210415.composição;

public class AppComposição {

    public static void main(String[] args) {
        Pedido p = new Pedido(100);

        Serviço limpezaAr = new Serviço("Limpeza Ar Split até 12000 btus");
        Serviço instalaçãoAr = new Serviço("Instalação Ar Split até 12000 btus");

        p.adicionarItem(limpezaAr, 3);
        p.adicionarItem(instalaçãoAr, 2);
        
    }
    
}
