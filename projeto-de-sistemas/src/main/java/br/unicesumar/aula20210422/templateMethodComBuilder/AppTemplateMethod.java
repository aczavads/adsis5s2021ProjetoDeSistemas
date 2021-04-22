package br.unicesumar.aula20210422.templateMethodComBuilder;

import java.util.HashMap;
import java.util.Map;

public class AppTemplateMethod {


    public static void main(String[] args) {
        CálculoDeFolhaDePagamento cálculoFP = new CálculoDeFolhaDePagamento() {
			
			@Override
			public Map<TipoHoraExtra, Double> obterValorHorasExtras(String matrícula, int mês, int ano) {
				return new HashMap<>();
			}
			
			@Override
			public double obterValorHoraNormal(String matrícula, int mês, int ano) {
				return 57.12;
			}
			
			@Override
			public double obterHorasNormais(String matrícula, int mês, int ano) {
				return 180;
			}
			
			@Override
			public Map<TipoHoraExtra, Double> obterHorasExtras(String matrícula, int mês, int ano) {
				return new HashMap<>();
			}
		};
		
		Holerite holerite5554454 = cálculoFP.calcularFolhaMensal("555445-4", 10, 2021);
		
		System.out.println(holerite5554454.getTotalDeProventos());
		

    }
    
}
