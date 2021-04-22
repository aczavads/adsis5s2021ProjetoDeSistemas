package br.unicesumar.aula20210422.templateMethodComBuilder;

import java.util.HashMap;
import java.util.Map;

public abstract class CálculoDeFolhaDePagamento {

    public Holerite calcularFolhaMensal(String matrícula, int mês, int ano) {
        double horasNormais = obterHorasNormais(matrícula, mês, ano);
        double valorHoraNormal = obterValorHoraNormal(matrícula, mês, ano);
        Map<TipoHoraExtra, Double> horasExtras = obterHorasExtras(matrícula, mês, ano);
        Map<TipoHoraExtra, Double> valorHorasExtras = new HashMap<>();
        if (!horasExtras.isEmpty()) {
        	valorHorasExtras = obterValorHorasExtras(matrícula, mês, ano);
        }
        Holerite h = (new Holerite.Builder())
         	.horasNormais(horasNormais)
         	.horasExtras(horasExtras)
         	.valorHoraNormal(valorHoraNormal)
         	.valorHorasExtras(valorHorasExtras)
         	.build();
        return h;
    }



    public abstract double obterValorHoraNormal(String matrícula, int mês, int ano);

    public abstract double obterHorasNormais(String matrícula, int mês, int ano);

    public abstract Map<TipoHoraExtra, Double> obterHorasExtras(String matrícula, int mês, int ano);
    
    public abstract Map<TipoHoraExtra, Double> obterValorHorasExtras(String matrícula, int mês, int ano);

}
