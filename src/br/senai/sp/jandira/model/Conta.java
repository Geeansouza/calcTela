package br.senai.sp.jandira.model;

public class Conta {

	private int multiplicando;
	private int maximoMultiplicador;

	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}

	public void setmaximoMultiplicador(int maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	private int resultado;

	private void calcular() {

		for (int multiplicador = 0; multiplicador <= maximoMultiplicador; multiplicador++) {
			resultado = multiplicador * multiplicando;

		}
	}

	public int getResultado() {
		return this.resultado;
	}
}
