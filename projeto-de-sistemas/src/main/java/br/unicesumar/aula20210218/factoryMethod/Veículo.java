package br.unicesumar.aula20210218.factoryMethod;

public class Veículo {

	public static Veículo criar(TipoVeículo tipo) {
        if (tipo == TipoVeículo.CARGA) {
            if (System.nanoTime()%2 == 0)  {
                return new Caminhão();
            }
            return new Pickup();
        }
		return null;
	}

}
