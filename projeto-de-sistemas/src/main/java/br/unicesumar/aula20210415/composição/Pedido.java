package br.unicesumar.aula20210415.composição;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {
    private int número;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int número) {
        this.número = número;
    }

    public void adicionarItem(Serviço serviço, int quantidade) {
        this.itens.add(new ItemPedido(serviço, quantidade)) ;
    }

    public void removerItem(ItemPedido item) {
        this.itens.remove(item);
    }

    public List<ItemPedido> getItens() {
        return Collections.unmodifiableList(itens);
    }


    public static class ItemPedido {
        private Serviço serviço;
        private int quantidade;

        public ItemPedido(Serviço serviço, int quantidade) {
            this.serviço = serviço;
            this.quantidade = quantidade;
        }

        public Serviço getServiço() {
            return serviço;
        }
        public int getQuantidade() {
            return quantidade;
        }
    }

}
