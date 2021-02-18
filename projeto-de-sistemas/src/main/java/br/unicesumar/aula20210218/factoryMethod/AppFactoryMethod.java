package br.unicesumar.aula20210218.factoryMethod;

public class AppFactoryMethod {

    public static void main(String[] args) {
        
        //Veículo dePassageiros = Veículo.criar(TipoVeículo.PASSAGEIROS);
        for (int i = 0; i < 5; i++) {
            VeículoDeCarga deCarga = (VeículoDeCarga) Veículo.criar(TipoVeículo.CARGA);
            double máximo = deCarga.getPesoMáximoDaCarga();
            System.out.println("Carga máxima: " + máximo + ". Tipo=" + deCarga.getClass().getSimpleName());        
            carregar(deCarga);
        }
    }

    private static void carregar(VeículoDeCarga deCarga) {
        deCarga.carregar(1101);

    }
    
}
