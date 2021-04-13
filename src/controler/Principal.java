package controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Sorvete;

public class Principal {
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------- ");
		System.out.println("             GERENCIAMENTO DE SORVETES               ");
		System.out.println("---------------------------------------------------- ");
		Scanner input = new Scanner(System.in);

		List<Sorvete> listaSorvete = new ArrayList<Sorvete>();

		Sorvete sorvete1 = new Sorvete("MORANGO", 1.00);
		Sorvete sorvete2 = new Sorvete("CHOCOLATE", 1.00);
		Sorvete sorvete3 = new Sorvete("NAPOLITANO", 1.00);

		listaSorvete.add(sorvete1);
		listaSorvete.add(sorvete2);
		listaSorvete.add(sorvete3);

		for (Sorvete sorvete : listaSorvete)

		{
			System.out.println("SABOR: " + sorvete.getSabor() + "|" + " VALOR: R$" + sorvete.getValor());
			System.out.println("---------------------------------------------------- ");

		}

		System.out.println("PARA ADICIONAR SORVETE [1] PARA REMOVER [2]");
		Sorvete s1 = new Sorvete(null, 0);
		int menu;
		menu = input.nextInt();
		switch (menu) {
		case 1:
			s1.inserir();
			break;
		case 2:
			s1.remover();
		case 3:

		default:
			break;
		}

	}
}