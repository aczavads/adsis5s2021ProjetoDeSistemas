package br.unicesumar.aula20210422.templateMethodComBuilder;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Holerite {
	public Double horasNormais;
	public double valorHoraNormal;
	public Map<TipoHoraExtra, Double> horasExtras;
	public Map<TipoHoraExtra, Double> valorHorasExtras;


	public Double getTotalDeProventos() {
		double proventos = this.horasNormais * this.valorHoraNormal;
		for (Entry<TipoHoraExtra, Double>  valor: valorHorasExtras.entrySet()) {
			proventos += this.horasExtras.get(valor.getKey()) * valor.getValue();
		}		
		return proventos;
	}
	
	
	public static class Builder {
		private Double horasNormais;
		private Map<TipoHoraExtra, Double> horasExtras;
		private double valorHoraNormal;
		private Map<TipoHoraExtra, Double> valorHorasExtras;

		public Builder horasNormais(double horasNormais) {
			this.horasNormais = horasNormais;
			return this;
		}

		public Builder horasExtras(Map<TipoHoraExtra, Double> horasExtras) {
			this.horasExtras = horasExtras;
			return this;
		}

		public Builder valorHoraNormal(double valorHoraNormal) {
			this.valorHoraNormal = valorHoraNormal;
			return this;
		}

		public Builder valorHorasExtras(Map<TipoHoraExtra, Double> valorHorasExtras) {
			this.valorHorasExtras = valorHorasExtras;
			return this;
		}

		public Holerite build() {
			if (!this.horasExtras.isEmpty()) {
				if (this.valorHorasExtras.isEmpty()) {
					throw new RuntimeException("Valor das horas extras deve ser definido quando houve extras no mês!");
				}
			}
			if (this.horasNormais > 0 && this.valorHoraNormal == 0) {
				throw new RuntimeException("Valor das horas normais deve ser definido quando houve trabalho no mês!");
			}
			Holerite novo = new Holerite();
			novo.horasNormais = this.horasNormais;
			novo.valorHoraNormal = this.valorHoraNormal;
			novo.horasExtras = this.horasExtras;
			novo.valorHorasExtras = this.valorHorasExtras;
			return novo;
		}
		
	}

}
