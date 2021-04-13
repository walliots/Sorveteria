package model;

import java.util.Scanner;

public class Sorvete {

	private String sabor;
	private double valor;

	Scanner input = new Scanner(System.in);

	public Sorvete(String sabor, double valor) {
		super();
		this.sabor = sabor;
		this.valor = valor;
	}

	public void inserir() {
		System.out.println("INSIRA O SABOR DO SORVETE ");
		this.sabor = input.nextLine();
		System.out.println("INSIRA O VALOR DO SORVETE ");
		this.valor = input.nextDouble();
	}

	public void remover() {
		System.out.println("INSIRA O SABOR QUE DESEJA REMOVER ");
		this.sabor = input.nextLine();
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Sorvete [sabor=" + sabor + ", valor=" + valor + ", input=" + input + "]";
	}

}
