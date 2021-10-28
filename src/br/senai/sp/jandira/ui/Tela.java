package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Conta;

public class Tela {

	public void criarTela() {

		// jFrame

		JFrame minhaTela = new JFrame();
		minhaTela.setSize(900, 700);
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setTitle("Calc Tabuada");
		minhaTela.setLayout(null);

		// Jlabel tabuada

		JLabel lblTabu = new JLabel();
		lblTabu.setText("Calc Tabuada");
		lblTabu.setFont(new Font("Roboto", Font.PLAIN, 30));
		lblTabu.setForeground(new Color(69, 32, 214));
		lblTabu.setBounds(20, 20, 200, 30);

		// jLabel multiplicando

		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando");
		lblMultiplicando.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMultiplicando.setBounds(20, 90, 200, 30);

		// Jlabel multiplicador

		JLabel lblMultiplicador = new JLabel();
		lblMultiplicador.setText("Multiplicador");
		lblMultiplicador.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMultiplicador.setBounds(20, 150, 200, 30);

		// Jlabel Resultados

		JLabel lblResultados = new JLabel();
		lblResultados.setText("Resultado:");
		lblResultados.setBounds(500, 50, 200, 30);
		lblResultados.setFont(new Font("Arial Black", Font.PLAIN, 26));

		// JTextField multiplicando

		JTextField tfmultiplicando = new JTextField();
		tfmultiplicando.setBounds(150, 90, 100, 30);

		// JTextField multiplicador

		JTextField tfMultiplicador = new JTextField();
		tfMultiplicador.setBounds(150, 150, 100, 30);

		// Jlabel Resultado

		JLabel lblresultadoImc = new JLabel();
		lblresultadoImc.setBounds(400, 600, 200, 30);
		lblresultadoImc.setFont(new Font("Arial", Font.PLAIN, 20));

		// Button Calcular

		Button btnCalcular = new Button("Calcular");
		btnCalcular.setFont(new Font("arial", Font.PLAIN, 30));
		btnCalcular.setBounds(50, 250, 300, 60);
		btnCalcular.setBackground(new Color(2, 209, 23));

		// Button limpar

		Button btnLimpar = new Button("Limpar");
		btnLimpar.setFont(new Font("arial", Font.PLAIN, 30));
		btnLimpar.setBounds(50, 350, 300, 60);
		btnLimpar.setBackground(new Color(242, 16, 0));

		// lista tabuada

		// Tela

		minhaTela.getContentPane().add(lblTabu);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(lblMultiplicador);
		minhaTela.getContentPane().add(tfmultiplicando);
		minhaTela.getContentPane().add(tfMultiplicador);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(btnLimpar);
		minhaTela.getContentPane().add(lblResultados);
		minhaTela.getContentPane().add(lblresultadoImc);

		minhaTela.setVisible(true);

		Conta conta = new Conta();
		lblresultadoImc.setText(String.valueOf(conta.getResultado()));

	}

}
