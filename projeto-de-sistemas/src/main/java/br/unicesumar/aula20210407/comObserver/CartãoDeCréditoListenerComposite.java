package br.unicesumar.aula20210407.comObserver;

import java.util.ArrayList;
import java.util.List;

public class CartãoDeCréditoListenerComposite implements CartãoDeCréditoListener {
    private List<CartãoDeCréditoListener> listeners = new ArrayList<>();


    public CartãoDeCréditoListenerComposite(CartãoDeCréditoListener... listeners) {
        for (CartãoDeCréditoListener cartãoDeCréditoListener : listeners) {
            this.listeners.add(cartãoDeCréditoListener);
        }
    }

    @Override
    public void débitoEfetuado(double valorDebitado) {
        for (CartãoDeCréditoListener cartãoDeCréditoListener : listeners) {
            cartãoDeCréditoListener.débitoEfetuado(valorDebitado);
        }        
    }
}
