package br.unicesumar.aula20210218.factoryMethod;

public abstract class VeículoDeCarga extends Veículo {
    private double cargaAtual = 0;

	public abstract double getPesoMáximoDaCarga();

	public void carregar(double quantidadeDeCarga) {
        if (cargaAtual + quantidadeDeCarga <= this.getPesoMáximoDaCarga()) {
            cargaAtual += quantidadeDeCarga;
        } else {
            throw new RuntimeException("Excesso de carga! Limite: " + this.getPesoMáximoDaCarga() + " kg.");
        }

    }
}
